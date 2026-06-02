import java.util.Scanner;

public class AgeCategory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if(age < 0 ){
            System.out.println("Invalid age ");
        }
        else if(age < 13){
            System.out.println("Child");
        }
        else if(age < 18 ){
            System.out.println("Teenager");
        }
        else if (age < 65) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior");
        }

        if(age >= 0){
            String canVote = (age >= 18) ? "yes" : "no" ;
            String canDrive = (age >= 18) ? "yes" : "no" ;
            String retired = (age >= 65) ? "yes" : "no" ;
            System.out.println("can vote " + canVote);
            System.out.println("can drive " + canDrive);
            System.out.println("retired " + retired);
        }

        sc.close();

    }
}