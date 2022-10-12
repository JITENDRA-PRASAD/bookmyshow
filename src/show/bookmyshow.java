package show;

import java.util.Scanner;

class sendEmailToUser{

    public static boolean sendEmailToUser(String str){
        str.length();
        return true;
    }
}
public class bookmyshow {

    public static int seat(){
        Scanner seat = new Scanner(System.in);
        int mySeat = seat.nextInt();
        return mySeat;
    }

    public static boolean availableSeat(int[] array, int num){
        boolean checked = false;
        for (int i=0; i<array.length;i++){
            if (array[i] == num){
                checked = true;
            }
        }
        return checked;
    }

    public static void availableSeats(int rowNum, int coloumNum, int[] array){
        int seatInShow = 1;
        for (int i=0; i<rowNum;i++){
            for (int j=0; j<coloumNum; j++){
                boolean booked = false;
                for (int x=0; x<array.length;x++){
                    if (seatInShow == array[x]){
                        booked = true;
                        break;
                    }
                }
                if (booked){
                    System.out.printf("__");
                } else {
                    System.out.printf("%d ", seatInShow);
                }
                if (seatInShow < 10 ){
                    System.out.printf(" ");
                }
                seatInShow++;
            }
            System.out.println("");
        }
    }

    public static boolean sendEmail(String str){
        boolean sendMail = true;
        sendEmailToUser emailToUser = new sendEmailToUser();
        if (emailToUser.sendEmailToUser(str)){
            System.out.println("mail send to user for booking movie ticket");
            return sendMail;
        }
        return false;
    }
}
