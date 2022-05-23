package com.second_solution;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ticket obj = new Ticket();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Booking ");
		int noofbook = obj.setNoofBooking(scanner.nextInt());
		 
		for(int i=0; i<noofbook; i++) {
			if(i==0) {
				System.out.println("Enter TicketId ");
				obj.setTicketId(scanner.nextInt());

				System.out.println("Enter AvailableTickets");
				obj.setAvailableTickets(scanner.nextInt());

				//scanner.nextLine();

				System.out.println("Enter Price");
				obj.setPrice(scanner.nextInt());

				System.out.println("Enter no of Tickets");
				int TicketCost = obj.calculateTicketCost(scanner.nextInt());
				
				
				System.out.println("Ticket Id: "+ obj.getTicketId());
				System.out.println("Available Tickets After Booking: "+ obj.getAvailableTickets());

				System.out.println("Ticket price: "+ obj.getPrice());


				System.out.println("Total amount: " +  TicketCost);
			}
			else {
				System.out.println("Enter TicketId ");
				obj.setTicketId(scanner.nextInt());

//				System.out.println("Enter AvailableTickets");
//				obj.setAvailableTickets(scanner.nextInt());

				//scanner.nextLine();

				System.out.println("Enter Price");
				obj.setPrice(scanner.nextInt());

				System.out.println("Enter no of Tickets");
				int TicketCost = obj.calculateTicketCost(scanner.nextInt());
				
				
				System.out.println("Ticket Id: "+ obj.getTicketId());
				

				System.out.println("Ticket price: "+ obj.getPrice());


				System.out.println("Total amount: " +  TicketCost);
				System.out.println("Available Tickets After Booking: "+ obj.getAvailableTickets());
			}
		}
		
//		System.out.println("Enter TicketId ");
//		obj.setTicketId(scanner.nextInt());
//
//		System.out.println("Enter AvailableTickets");
//		obj.setAvailableTickets(scanner.nextInt());
//
//		//scanner.nextLine();
//
//		System.out.println("Enter Price");
//		obj.setPrice(scanner.nextInt());
//
//		System.out.println("Enter no of Tickets");
//		int TicketCost = obj.calculateTicketCost(scanner.nextInt());
//		
//		
//		System.out.println("Ticket Id: "+ obj.getTicketId());
//		System.out.println("Available Tickets After Booking: "+ obj.getAvailableTickets());
//
//		System.out.println("Ticket price: "+ obj.getPrice());
//
//
//		System.out.println("Total amount: " +  TicketCost);
	}
	
	

}
