import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // if (((year%4 ==0) || (year % 100 == 0)) || (year % 400 == 0)) Not right way 

        boolean x = (year%4 ==0);
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if( x && y || z){
            System.out.println("Its a Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
    
}
