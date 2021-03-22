import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.String;

class Main {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);

            Long n = scanner.nextLong();
            Long cnt = 0L;
            for (long i = 0; i <= 1000000; i++) {
                String str = String.valueOf(i);
                Long times = 1L;
                for (int j = 0; j < str.length(); j++) {
                    times *= 10;
                }
                System.out.println(i * times);
                if (n < i * times) {
                    break;
                }
                cnt += 1;
            }
            System.out.println(cnt);
        } catch (InputMismatchException e) {
        }
    }
}
