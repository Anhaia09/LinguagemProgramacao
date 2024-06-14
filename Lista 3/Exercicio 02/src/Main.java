import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior,menor;
        maior = 0;
        menor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if(i==0){
                maior=numero;
                menor=numero;

            }else{
                if (numero > maior)
                    maior = numero;
                if (numero < menor)
                    menor = numero;
            }
        }
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);
    }
}