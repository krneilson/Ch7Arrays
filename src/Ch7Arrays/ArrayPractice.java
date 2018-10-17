package Ch7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //Step1: declare the variable
        int[] numbers1 = new int[5]; //an integer array of size 5
        //Step2: initialize the variable
        System.out.println(Arrays.toString(numbers1)); //before populating the array
        for (int i = 0; i < 5; i++) {
            numbers1[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers1)); // after populating the array

        //Step1&2: declare and initialize
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2));
        randomArray();

        //mode problems 10/15-16/18
        int num = 669360267;
        System.out.println("Mode is: " + badmode(num));
        num = 5713523;
        System.out.println("Mode is: " + goodmode(num));

    }

    public static void randomArray() {
        int randomNum = (int) (Math.random() * 10 + 1);
        int[] ranArray = new int[randomNum];
        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(ranArray));
    }

    public static int badmode(int num){
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
       while(num > 0){
           int diget = num % 10;
           if(diget == 0){
               zero++;
           }
           if(diget == 1){
               one++;
           }
           if(diget == 2){
               two++;
           }
           if(diget == 3){
               three++;
           }
           if(diget == 4){
               four++;
           }
           if(diget == 5){
               five++;
           }
           if(diget == 6){
               six++;
           }
           if(diget == 7){
               seven++;
           }
           if(diget == 8){
               eight++;
           }
           if(diget == 9){
               nine++;
           }
          num = num / 10;
       }
       int max = Math.max(one,two);
       max = Math.max(max,three);
       max = Math.max(max,four);
       max = Math.max(max,five);
       max = Math.max(max,six);
       max = Math.max(max,seven);
       max = Math.max(max,eight);
       max = Math.max(max,nine);

       if(max == zero){
           return 0;
       }
       else if(max == one){
           return 1;
       }
       else if(max == two){
           return 2;
       }
       else if(max == three){
           return 3;
       }
       else if(max == four){
           return 4;
       }
       else if(max == five){
           return 5;
       }
       else if(max == six){
           return 6;
       }
       else if(max == seven){
           return 7;
       }
       else if(max == eight){
           return 8;
       }
       else {
           return 9;
       }
    }

    public static int goodmode(int num){
        int[] array = new int[10];
        while(num > 0){
            int diget = num%10;
            array[diget]++;
            num = num / 10;
        }
        int maxIndex = 0;
        int maxValue = 0;
        for(int i = 0; i <= 9; i++){
            if(maxValue < array[i]){
                maxIndex = i;
                maxValue = array[i];
            }
        }
        return maxIndex;
    }
}
