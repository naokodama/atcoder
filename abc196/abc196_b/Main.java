import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);

            String x = scanner.next();

            x = x.replaceAll("\\.[0-9]*", "");

            System.out.println(x);

        } catch (InputMismatchException e) {
        }
    }
}
