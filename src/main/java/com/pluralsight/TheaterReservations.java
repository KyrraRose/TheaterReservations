package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        //New scanner!
        Scanner mrMcScans=new Scanner(System.in);

        //Welcome!
        System.out.print("~ Welcome to Xanathar's Theater! ~\nPlease enter your full name: ");
        String name = mrMcScans.nextLine();

        //Date get
        System.out.print("What is the date of the show (MM/DD/YY)?: ");
        String userDate = mrMcScans.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDate showDate = LocalDate.parse(userDate,format);

        //Number of tickets
        System.out.print("How many tickets would you like?: ");
        String tickets = mrMcScans.nextLine();
        int numTickets = Integer.parseInt(tickets);

        if (numTickets == 1){
            System.out.println("1 ticket reserved for %");
        }
    }

}
