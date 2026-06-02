import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score ");

         double score  = sc.nextDouble();
         if (score > 100 || score <0) {
             System.out.println("Invalid score ");
         }
         else if (score >= 90 ){
             System.out.println("A — Excellent");
         } else if (score >= 80 ) {
             System.out.println("B — Good");
         } else if (score >= 70) {
             System.out.println("C average");
         } else if (score >= 60) {
             System.out.println("D below average");

         }
         else {
             System.out.println("F failed ");
         }

         if (score >=0 && score <=100){
             String status = (score >=60 ) ? " You Passed" : " you failed";
             System.out.println(status);
         }
         sc.close();
    }
}