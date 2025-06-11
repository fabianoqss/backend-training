package questao13;

public class Questao13 {

    public static double hiperfatorial(double base){

        if(base == 1) return 1;
        return Math.pow(base, base) * hiperfatorial(base - 1);
    }
}
