import java.util.Scanner;

public class Lista12 {
    public static void main(String[] args) {
     
        double altura;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é a sua altura?");
        altura = input.nextDouble();

        System.out.println("Peso ideal: " + (72.7 * altura - 58));
        input.close();
    }
}
