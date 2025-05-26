package questao15;

import java.util.Arrays;

public class Questao15 {

    public static int sum(int numero){
        if (numero < 10) return numero;

        return (numero % 10) + sum(numero / 10);
    }

}
