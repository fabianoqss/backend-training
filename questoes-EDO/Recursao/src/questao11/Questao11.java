package questao11;

public class Questao11 {

    public static String seq(int n){

        if(n <= 1000){
        return crescente(n);
        }

        return n + "";
    }

    public static String crescente(int n){

        if(n < 1000) return n + ", " + crescente(n * 2) + ", " + descrescente(n / 2);

        return n/2 + "";
    }

    public static String descrescente(int n){

        if(n <= 0) return n + "," + descrescente(n /2);

        return n + "";
    }
}
