
public class TicketCounter {

	int tickets = 3;
	public synchronized void bookTicket(String name,int noOfSeats)
	{
		if(tickets >= noOfSeats && noOfSeats > 0)
		{
			System.out.println("Hi "+ name + " Seats Booked");
			tickets = tickets - noOfSeats;
		}
		else
		{
			System.out.println("Not Available");	
		}
	}

}
