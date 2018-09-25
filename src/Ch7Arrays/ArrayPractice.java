package Ch7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        //Step1: declare the variable
        int[] numbers1 = new int[5]; //an integer array of size 5
        //Step2: initialize the variable
        System.out.println(Arrays.toString(numbers1)); //before populating the array
        for(int i = 0; i < 5; i++){
            numbers1[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers1)); // after populating the array

        //Step1&2: declare and initialize
        int[] numbers2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers2));
        randomArray();
    }

    public static void randomArray(){
        int randomNum = (int)(Math.random() * 10 + 1);
        int[] ranArray = new int[randomNum];
        for(int i = 0; i < ranArray.length; i++){
            ranArray[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(ranArray));
    }
}
