package questao14;

public class Questao14 {

    public static int somaNumeros(int x, int y){

        if(y == 0){
            return x;
        }

        return somaNumeros(sucessor(x), predecessor(y));
    }


    public static int sucessor(int x){
        return x + 1;
    }

    public static int predecessor(int y){
        return y - 1;
    }
}
