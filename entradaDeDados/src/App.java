import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println(sc);

        String x;

        x = sc.next();
        System.out.println("o texto é " + x);
        sc.close();
    }
}
