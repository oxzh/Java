import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        A = sc.nextInt();
        sc.nextLine();
        B = sc.nextInt();
        sc.nextLine();
        C = sc.nextInt();
        sc.nextLine();
        D = sc.nextInt();


        int multi1 = A*B;

        int multi2 = C*D;

        int diferenca = multi1 - multi2;

        System.out.printf("A diferença é: " + diferenca);



        int E, F, G, H;
        E = sc.nextInt();
        sc.nextLine();
        F = sc.nextInt();
        sc.nextLine();
        G = sc.nextInt();
        sc.nextLine();
        H = sc.nextInt();
        sc.close();

        int multi3 = E*F;

        int multi4 = G*H;

        int diferenca2 = multi3 - multi4;

        System.out.printf("A diferença é: " + diferenca2);

    }
}