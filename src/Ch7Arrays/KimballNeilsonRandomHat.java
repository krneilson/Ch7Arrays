package Ch7Arrays;

import java.util.Arrays;

public class KimballNeilsonRandomHat {
    public static void main(String[] args){

        int[] array = pickTeams();
        printTeams(array);

    }

    public static int[] pickTeams(){
        int[] teamArray = new int[8];
        for(int i = 0; i <= teamArray.length - 1; i++){
            int num = (int) (Math.random() * 8) + 1;
            boolean x = true;
           do  {
                num = (int) (Math.random() * 8) + 1;
                x =  uniqueNum (teamArray, num);

            }while (x == true);
            teamArray[i] = num;

            //System.out.println(num);

        }
        //System.out.print(Arrays.toString(teamArray));

        return teamArray;
    }


    public static boolean uniqueNum(int[] array, int num) {
        for(int i = 0; i <= array.length-1; i++){
            if(array[i] == num)
                return true;

        }
        return false;
    }

    public static void printTeams(int[] teams){
        for(int i = 0; 1 <= 6; i+=2) {
            System.out.println("Team " + teams[i] + " vs. Team " + teams[i+1]);
        }
    }
}

