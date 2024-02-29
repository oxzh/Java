import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println(sc);

        int x;

        x = sc.nextInt();
        System.out.println("o texto é " + x);
        sc.close();
    }
}
