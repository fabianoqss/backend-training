package questao7;

public class Questao7 {


    public static String recebeArray(int []array, int index){

        if(index == 0){
            return array[index] + "";
        }

        return array[index] +  " - " + recebeArray(array, index - 1);
    }
}
