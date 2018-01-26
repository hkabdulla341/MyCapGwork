package Main;

public class SimulateRoomBooking
{

    public static void main(String[] args)
    {
	int noOfRooms = 6;

	Room[] listOfRoom = new Room[noOfRooms];

	for (int i = 0; i < noOfRooms; i++)
	{
	    listOfRoom[i] = new Room(i);
	}

	int noOfThread = 20;
	Thread[] listOfThreads = new Thread[noOfThread];

	ProjectManager firstPrjMgr = new ProjectManager(0, "Ezio", "def", 3, 'a', "01/01/2017");
	ProjectManager secondPrjMgr = new ProjectManager(0, "Al-tair", "def", 3, 'a', "01/01/2017");

	for (int i = 0; i < noOfThread; i++)
	{
	    if (i % 2 != 0)
	    {
		listOfThreads[i] = new ConferenceRoomBookingJob(listOfRoom, firstPrjMgr);
	    }
	    else
	    {
		listOfThreads[i] = new ConferenceRoomBookingJob(listOfRoom, secondPrjMgr);
	    }
	}
	
	for(int i = 0; i < noOfThread; i++)
	{
	    listOfThreads[i].start();
	}

	// Thread t1 = new ConferenceRoomBookingJob(listOfRoom, firstPrjMgr);
	// Thread t2 = new ConferenceRoomBookingJob(listOfRoom, secondPrjMgr);
	// t1.start();
	// t2.start();
    }

}
