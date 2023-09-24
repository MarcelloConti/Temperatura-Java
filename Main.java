import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //classe scanner para input de usuario
        Scanner teste = new Scanner(System.in);

        System.out.println("Conversão de temperatura");
        System.out.println("\n Digite a temperatura: ");

        //input de usuario
        double temperatura = teste.nextDouble();

        //cast to int
        int tempe;
        tempe = (int) (temperatura);
        System.out.println("\nTemperatura em graus: " + tempe + "°C");

        //casting explicito int to double
        double temp = (temperatura * 1.8) + 32;
        System.out.println("\nConversão para Fahrenheit: " + temp + "°F");

        //cast to int
        int tempf;
        tempf = (int) (temp);
        System.out.println("\nFahrenheit sem casa decimal: " + tempf +"°F");



    }
}