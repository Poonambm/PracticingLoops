
import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int start = scanner.nextInt();

int end = 11;
for (int i = start; i <= end; i++) {
        System.out.println(i);
}
    }
}