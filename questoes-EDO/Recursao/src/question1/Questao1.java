package question1;

public class Questao1 {

    public static int numberPrimo(int x, int soma){

        if(x == 1){
            return soma;
        } else if (verificaPrimo(x)) {
            soma+= x;
        }

        return numberPrimo(x - 1, soma);
    }


    public static boolean verificaPrimo(int x){
        if (x <= 1) return false;

        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }

        return true;
    }
}
