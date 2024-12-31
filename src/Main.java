//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println("Olá mundo! ");
    System.out.println("Tudo bem?");
    int a = 20;
    int b = 20;
    boolean c = false;
    int soma;
    /*
    Operadores Matemáticos
    + somar
    - subtrair
    * multiplicar
    / dividir
    % resto da divisão

     Operadores Relacionais
     == igual
     != diferente
     > maior
     < menor
     >= maior ou igual
     <= menor ou igual

     Operadores Lógicos
     && E(AND)
     || OU (OR)
     ! NÃO (NOT)
     */
        soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;
        System.out.println ("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtracao é: " + subtracao);
        System.out.println("O resultado da multiplicacao é: " + multiplicacao);
        System.out.println(" O resultado da divisao é : " + divisao);
        System.out.println("O resultado do resto da divisão é: " + resto);
        boolean resultado= (a ==b && a>=10);
        System.out.println(" A e B são iguais e maior que 10?: " + resultado);
        boolean comparacao = (a!=b);
        System.out.println("A e B são diferentes? : " +comparacao);
        boolean comparacao2 = (a==b || a>10) && ( multiplicacao==10);
        System.out.println("Teste "+comparacao2);


    }
}