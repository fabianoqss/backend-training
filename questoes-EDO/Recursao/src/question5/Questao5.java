package question5;

public class Questao5 {
    public static int retornaArray(int[] array, int index){

        if(index == array.length - 1) return 0;

        return array[index] + retornaArray(array , index + 1);
    }

}
