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
        int salary = 25000;
        if (salary > 10000){
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}