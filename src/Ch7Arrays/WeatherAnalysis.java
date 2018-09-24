//This program takes user input and calculates the
//average temperature of those days
//it also determines the # of days above the average
package Ch7Arrays;

import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args) {

        numOfDays();
    }

    //Step1: ask for user input, # of days
    public static void numOfDays() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numdays = console.nextInt();
        createArray(console, numdays);

    }

    //Step2: use user input to create an container
    public static void createArray(Scanner console, int numdays) {
        int[] tempArray = new int[numdays];
        int cumSum = 0;
        pupulateArray(numdays);
    }

    //Step3: populate the container with user input, Temps
    public static void
        for(
    int i = 0;
    i<numdays;i++)

    {
        System.out.print("Day " + (i + 1) + "'s high temp: ");
        tempArray[i] = console.nextInt();
        cumSum += tempArray[i];
    }

    //Step4: determine the average Temp
    double average = (double) cumSum / (double) numdays;
    average =Math.round(average *10.0)/10.0;
        System.out.println("Average temp = "+average);

    //Step5: determine the # of days above the average Temp
    int aboveAverage = 0;
        for(
    int i = 0;
    i<numdays;i++)

    {
        if (tempArray[i] > average) {
            aboveAverage++;
        }
    }
        System.out.println(aboveAverage +" days were above average.");
}


