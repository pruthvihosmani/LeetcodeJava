import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // initilastion of the input
        int n = input.nextInt();
        int i;
        // print numbers from one to five;
        /*
        syntax for loops;
        for(intialisation; conditon;  increment/decrement){
        //bod
         */
        for ( i=0; i<= 10; i++){
            System.out.println(i);
            for (int num = 3; num <= 6; num += 2){
                System.out.println(num);
            }
            for (int j = 0; j < n; j++) {
                System.out.println(j + " ");

            }
        }
    }
}
