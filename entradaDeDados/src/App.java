import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String a, b, c;
        int x;

        // next(), nextInt(), nextDouble, next().charAt(0)

        x = sc.nextInt();
        // newline necessaria pois o enter no no nextInt anterior consome a proxima
        // sc.nextline

        sc.nextLine();
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.next();
        System.out.println("texto " + a + " texto " + b + " texto " + c + "numero " + x);
        sc.close();

    }
}
