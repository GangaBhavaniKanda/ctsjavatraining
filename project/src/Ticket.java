public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    public Ticket(){
        super();
    }
     public int getTicketid() {
			return ticketid;
		}
		public void setTicketid(int ticketid) {
			this.ticketid = ticketid;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public static int getAvailableTickets() {
			return availableTickets;
		}
		public static void setAvailableTickets(int availableTickets) {
		    
			    Ticket.availableTickets =availableTickets;
		}
		public int calculateTicketCost(int nooftickets){
			System.out.println(availableTickets);
		    if(availableTickets>0){
		        availableTickets=availableTickets-nooftickets;
		        int total=price*nooftickets;
		        return total;
		    }
		    else{
		        return -1;
		    }
		}
}