public class App {
    public static void main(String[] args) throws Exception {

        // Declarando var's
        int idade = 18;
        int caixaDeOvo = 30;
        int caixaDeLeite = 30;
        double pi = 3.14159265359;

        // print simples
        System.out.println("Hello World!");
        System.out.println("Bom Dia!");

        // print de uma var.
        System.out.print("A minha idade é: ");
        System.out.println(idade);

        // Soma simples, como em qualquer outra linguagem com um print.
        System.out.print("A soma de uma caixa de ovo e uma caixa de leite é ");
        System.out.println(caixaDeOvo + caixaDeLeite);

        // System.out.print: Printa um texto no terminal/console do computador;
        // ...printf() formata a saída, delimitando a quantidade de números a serem
        // exibidos, no caso, dois
        System.out.println("Pi até sua segunda casa deciamal depois do ponto é: ");
        System.out.printf("%.2f%n", pi);

    }
}
