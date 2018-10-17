package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;

//This program takes user input for a even number of teams
//and creates the rooster for the first round of competition
//with different teams competing against each other
public class KimballNeilsonRandomHatV2 {
    public static void main(String[] args){

        int teams = numteams();
        int[] array = pickTeams(teams);
        printTeams(array, teams);

    }

    //method askes the user for the number of teams they want
    public static int numteams(){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a even number of teams: ");
        int num = console.nextInt();
        while(num % 2 != 0){
            System.out.print("Please enter a even number of teams: ");
            num = console.nextInt();
        }
        return num;
    }

    //populates the array with integers
    public static int[] pickTeams(int numteams){
        int[] teamArray = new int[numteams];
        for(int i = 0; i <= teamArray.length - 1; i++){
            int num = 0;
            boolean x = true;
            do  {
                num = (int) (Math.random() * numteams) + 1;
                x =  uniqueNum (teamArray, num);

            }while (x == true);
            teamArray[i] = num;



        }


        return teamArray;
    }

    //checks to make sure no integer is repeated
    //method found on  "stackoverflow"
    public static boolean uniqueNum(int[] array, int num) {
        for(int i = 0; i <= array.length-1; i++){
            if(array[i] == num)
                return true;

        }
        return false;
    }

    //prints the rooster for the first round
    public static void printTeams(int[] teams, int numteams){
        for(int i = 0; i <= numteams - 2; i+=2) {
            System.out.println("Team " + teams[i] + " vs. Team " + teams[i+1]);
        }
    }
}