import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble() ) {
            double celsius = scanner.nextDouble();
            if(celsius < -273.15){
                System.out.println("Entrada invalida");
            }else{
                double f = (celsius * 9/5) + 32;
                System.out.println(f);
            }

        } else {
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}