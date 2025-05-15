package question6;

public class Questao6 {
    public static String termosPA(int termos, double atual, double razao){

        if (termos == 0){
            return "";
        }

        return " >> "+ atual + termosPA(termos - 1, atual + razao, razao);
    }

}
