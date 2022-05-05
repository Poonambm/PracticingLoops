import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            System.out.println("Give a number");
            int num = scanner.nextInt();
            if (num == 5) {
                break;
            }
                    
        }
        System.out.println("Process finished with exit code 0");
          }
}
