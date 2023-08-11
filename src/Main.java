import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
         syntax of if statements:
         if(boolean Expression T or F)
         {
         // body
         } else {
         // do this
         }
          */
        int salary = 26000;
//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
        // multiple if
        if (salary > 10000) {
            salary += 2000;
        } else if ( salary > 25000) {
            salary += 1000;
        } else {
            salary += 25000;
        }
        //Scanner input = new Scanner(System.in);
        System.out.println(salary);
    }
}