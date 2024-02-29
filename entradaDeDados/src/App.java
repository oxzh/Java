import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String a;
        int b;
        double c;

        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();
        System.out.println("Meu nome é " + a + " Idade é, " + b + " e altura é: " + c);
        sc.close();

    }
}
