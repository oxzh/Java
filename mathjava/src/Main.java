public class Main {
    public static void main(String[] args)
    {
        double x = 6.0;
        double y = 8.0;
        double z = -10.0;
        double  A, B, C;
        // Raiz quadrada
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + "= " + A );
        System.out.println("Raiz quadrada de " + y + "= " + B );
        System.out.println("Raiz quadrada de 25 = " + C );


        //potência
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + "elevado a " + y + " = " + A);
        System.out.println(x + " Elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = "+ C);

        //abs = absolute, ou seja é o valor dado, porém se estiver negativo, vira positivo.
        A = Math.abs(y);
        B  = Math.abs(z);

        System.out.println("Valor Absoluto de " + y + "+ " + A);
        System.out.println("Valor Absoluto de " + z + "= " + B);
    }

}