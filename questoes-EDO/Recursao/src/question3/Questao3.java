package question3;

public class Questao3 {

    public static int calcularPotencia(int base, int expoente){

        if(expoente == 0) return 1;

        return base * calcularPotencia(base, expoente - 1);
    }
}
