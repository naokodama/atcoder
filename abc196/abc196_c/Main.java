import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.String;

class Main {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);

            Long n = scanner.nextLong();
            Long cnt = 0L;
            for (long i = 0; i < n + 1; i++) {
               String str = String.valueOf(i);
               int half = str.length() / 2;
               if (str.length() % 2 == 0) {
                    String halfBef = str.substring(0, half);
                    String halfAft = str.substring(half, str.length());
                    if(halfBef.equals(halfAft)) {
                        cnt += 1;
                    }
                }
            }
            System.out.println(cnt);
        } catch (InputMismatchException e) {
        }
    }
}
