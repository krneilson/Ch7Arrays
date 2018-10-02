package Ch7Arrays;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] array = {5,4,7,12};
        array  = abbyAlgo(array);
        System.out.println(Arrays.toString(array));
        jonnyAlgo(array);
    }

    //Johny's algorithm uses the concept of an in array swap
    public static void jonnyAlgo(int[] ja){
        for(int i = 0; i <  ja.length / 2; i++){
            int temp = ja[i];
            ja[i] = ja[ja.length-i-1];
            ja[ja.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(ja));
    }

    //Abby's algorithm a temporary array
    public static int[] abbyAlgo(int[] aa){
        int[] array = new int[aa.length];
        int counter = 0;
        for(int i = aa.length-1; i >= 0; i--) {
            array[counter] = aa[i];
            counter++;
        }
        aa=array;
        System.out.println(Arrays.toString(aa));
        return aa;
    }
}
