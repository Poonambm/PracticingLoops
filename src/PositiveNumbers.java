import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a number :");

            int num1 = scanner.nextInt();
            if (num1 > 0) {
                System.out.println("Number is " + num1);
            }
            if (num1 < 0) {
                System.out.println("Number must be positive!");
            }
            if (num1 == 0){
            break;
            }
        }
        System.out.println("Process finished with exit code 0");
    
    

    }
}
