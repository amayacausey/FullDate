import java.util.Scanner;

public class FullDate {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter month (mm) : ");
        String userMonth= " ";
        int month= sc.nextInt();

        if (month==1) {
            userMonth = "January";
        } else if (month==2) {
            userMonth = "February";
        } else if (month==3) {
        userMonth = "March";
        } else if (month==4) {
        userMonth = "April";
        } else if (month==5) {
        userMonth = "May";
        } else if (month==6) {
        userMonth = "June";
        } else if (month==7) {
        userMonth = "July";
        } else if (month==8) {
        userMonth = "August";
        } else if (month==9) {
        userMonth = "September";
        } else if (month==10) {
        userMonth = "October";
        } else if (month==11)
            userMonth = "September";
        else if (month==12) {
            userMonth = "December";
        }
        System.out.println("Please Enter day (dd) : ");
        int day= sc.nextInt();
        sc.nextLine();
        System.out.println("Please Enter year (yy) : ");
        String year= sc.nextLine();
        String userYear = "20";
        year = userYear+ year;

        System.out.println("It is " +userMonth +" " +day +", " +year);
        System.out.println("Application finished");

        
    }
}
