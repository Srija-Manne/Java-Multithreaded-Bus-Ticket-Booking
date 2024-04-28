
public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TicketCounter tc = new TicketCounter();
		TicketBookingThread t1 = new TicketBookingThread(tc,"Srija",2);
		TicketBookingThread t2 = new TicketBookingThread(tc,"ewewa",2);
		t1.start();
		t2.start();
		
	}

}
