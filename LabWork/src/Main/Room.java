package Main;

public class Room
{
    private int roomId;
    private ProjectManager currPrjManager;

    public Room(int roomId)
    {
	this.roomId = roomId;
    }

    public int getRoomId()
    {
	return roomId;
    }

    public String bookedBy()
    {
	if (currPrjManager == null)
	    return "None";
	else
	    return currPrjManager.getFirstName();
    }

    public boolean isRoomAvailable()
    {
	if (currPrjManager == null)
	    return true;
	else
	    return false;
    }

    synchronized public void occupyRoom(ProjectManager bookingPrjMgr)
    {
	if (!isRoomAvailable())
	{
	    try
	    {
		System.out.println("Room " + this.roomId + " is currently booked by " + bookedBy());

		System.out.println("Waiting for room to notify it is free...");
		wait();

		System.out.println("Room " + this.roomId + " has notified that it is free...Proceed to book room..");
	    }
	    catch (InterruptedException e)
	    {
		System.out.println("InterruppetedException caught at line 29...");
	    }
	}

	this.currPrjManager = bookingPrjMgr;
    }

    synchronized public ProjectManager leaveRoom()
    {
	ProjectManager temp = this.currPrjManager;

	this.currPrjManager = null;

	notifyAll();
	return temp;
    }
}
