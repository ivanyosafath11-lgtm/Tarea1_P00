import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe una frase o palabra en minúsculas: ");
        String texto = scanner.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    break;
            }
        }

        System.out.println("El total de elementos clave encontrados es: " + contador);
        scanner.close();
    }
}