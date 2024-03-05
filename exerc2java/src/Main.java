public class Main {
    public static void main(String[] args)
    {
        double cubos = 2.0;
        double pi = 3.14159;
        double raio = Math.pow(cubos, 2);

        double area = pi * raio;
        System.out.printf( "A área do cubo é %.4f%n", area );

        double cubos2 = 100.64;
        double raio2 = Math.pow(cubos2, 2);
        double area2 = pi * raio2;
        System.out.printf("A área do cubo é %.4f%n", area2);

        double cubos3 = 150.00;
        double raio3 = Math.pow(cubos3, 2);
        double area3 = pi * raio3;
        System.out.printf("A área do cubo é %.4f", area3);

    }
}