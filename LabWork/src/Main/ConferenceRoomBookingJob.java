package Main;

import java.util.Random;

public class ConferenceRoomBookingJob extends Thread
{
    private ProjectManager prjManager;
    private Room rooms[];

    public ConferenceRoomBookingJob(Room[] rooms, ProjectManager prjManager)
    {
	this.rooms = rooms;
	this.prjManager = prjManager;
    }

    @Override
    public void run()
    {
	performRun();
    }

    synchronized public void performRun()
    {
	int randomRoom = new Random().nextInt(6);
	
	System.out.println("PM " + prjManager.getFirstName() + " want to book room " + randomRoom);

	rooms[randomRoom].occupyRoom(prjManager);
	System.out.println("Room " + rooms[randomRoom].getRoomId() + " has been booked successfully...");

	int sleepTime = new Random().nextInt(2001) + 500;
	
	try
	{
	    System.out.println(
		    "--- Room " + rooms[randomRoom].getRoomId() + " has been booked for " + (double) sleepTime / 1000 + " seconds... ---");
	    Thread.sleep(sleepTime);
	}
	catch (InterruptedException e)
	{
	    System.out.println("InterruppetedException caught at line 43...");
	}

	System.out.println("To Leave room...");
	rooms[randomRoom].leaveRoom();

	if (rooms[randomRoom].isRoomAvailable())
	{
	    System.out.println("Room " + rooms[randomRoom].getRoomId() + " is available... To notify all");
	}

	notifyAll();
    }
}
