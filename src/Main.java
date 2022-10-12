import java.util.Arrays;
import java.util.Scanner;

import show.bookmyshow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter row present in theater");
        Scanner row = new Scanner(System.in);
        int rowNum = row.nextInt();
        System.out.println("Please enter coloum present in theater");
        Scanner coloum = new Scanner(System.in);
        int coloumNum = coloum.nextInt();
        int bookedSeat[] = {};
        bookmyshow seatNum = new bookmyshow();
        seatNum.availableSeats(rowNum, coloumNum, bookedSeat);
        System.out.println("Welcome to theater !!!!!!");
        while (true){
            System.out.println("Please enter valid email for ticket booking :");
            Scanner email = new Scanner(System.in);
            String userEmail = email.next();
            System.out.println("Please enter seat Number :");
            int mySeatNum = seatNum.seat();
            boolean checked = seatNum.availableSeat(bookedSeat, mySeatNum);
            if (mySeatNum > rowNum * coloumNum || checked || mySeatNum==0){
                System.out.println("Please enter valid seat number to book seat, Selected Seat is already booked or not exist !!!!");
            } else {
                bookedSeat = Arrays.copyOf(bookedSeat, bookedSeat.length+1);
                bookedSeat[bookedSeat.length - 1] = mySeatNum;
                System.out.printf("seat number %d booked for you \n", mySeatNum);
                System.out.printf("booked seats : %s \n", Arrays.toString(bookedSeat));
                boolean sendEmailToUser = seatNum.sendEmail(userEmail);
                System.out.printf("mail send to user for booking ticket : %B \n", sendEmailToUser);
                seatNum.availableSeats(rowNum, coloumNum, bookedSeat);
            }
        }
    }
}