
public class TicketBookingThread extends Thread{

	private TicketCounter tc;
	private String passengerName;
	private int noOfSeats;
	public TicketBookingThread(TicketCounter tc, String passengerName, int noOfSeats) {
		this.tc = tc;
		this.passengerName = passengerName;
		this.noOfSeats = noOfSeats;
	}
	public void run()
	{
		tc.bookTicket(passengerName, noOfSeats);
	}

}
