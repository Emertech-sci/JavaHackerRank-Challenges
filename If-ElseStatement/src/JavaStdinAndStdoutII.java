import java.util.Scanner;

public class JavaStdinAndStdoutII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d =scanner.nextDouble();
        String k = scanner.nextLine();
        String s = scanner.nextLine();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
