import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringOriginal = ""; boolean verifyString = false;

        do {
            System.out.println("Digite uma String para ser revertida: ");
            try {
                stringOriginal = scan.nextLine();
//                scan.nextLine();
                verifyString = true;
            } catch (Exception ex) {
                System.out.println("Entrada inválida. Por favor, digite uma string válida.");
                scan.nextLine(); //Limpa o buffer do Scanner;
            }
        }  while(!verifyString);

        String stringInvertida = inverterString(stringOriginal);
        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);
    }

    public static String inverterString(String string) {
        char[] caracteres = string.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {

            // Troca os caracteres nas posições inicio e fim
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}