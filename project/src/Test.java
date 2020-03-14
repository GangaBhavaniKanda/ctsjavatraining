import java.util.*;
public class Test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int booking=sc.nextInt();
        System.out.println("Enter the available tickets:");
       int availabletic=sc.nextInt();
        for(int i=0;i<booking;i++){
            System.out.println("Enter the ticketid:");
            int tid=sc.nextInt();
            System.out.println("Enter the price:");
            int p=sc.nextInt();
            System.out.println("Enter the no of tickets:");
            int no_of_tickets=sc.nextInt();
            Ticket t=new Ticket();
            t.setTicketid(tid);
            t.setPrice(p);
            Ticket.setAvailableTickets(availabletic);
            int total=t.calculateTicketCost(no_of_tickets);
            System.out.println("Available tickets: "+Ticket.getAvailableTickets());
            System.out.println("Total amount:"+total);
            System.out.println("Available ticket after booking:"+Ticket.getAvailableTickets());
        }    
            
        }
  

}
