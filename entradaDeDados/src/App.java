import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String a, b, c;

        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.next();
        System.out.println("texto " + a + " texto " + b + " texto " + c);
        sc.close();

    }
}
