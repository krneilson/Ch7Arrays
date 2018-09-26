//This program takes user input and calculates the
//average temperature of those days
//and determines the # of days above the average
//it also print the user's input and the two hottest and coldest days
package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KimballNeilsonWeatherAnalysis2 {
    public static void main(String[] args) {

        numOfDays();
    }

    //Step1: ask for user input, # of days
    //this method asks the user for the number of days
    public static void numOfDays() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numdays = console.nextInt();
        createArray(console, numdays);

    }

    //Step2: use user input to create an container
    //this method creates the array with a length specified by the user
    public static void createArray(Scanner console, int numdays) {
        int[] tempArray = new int[numdays];
        int cumSum = 0;
        populateArray(numdays, tempArray, cumSum, console);
    }

    //Step3: populate the container with user input, Temps
    //this method populates the array with user input
    public static void populateArray(int numdays, int[] tempArray, int cumSum, Scanner console) {
        for (int i = 0; i < numdays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            tempArray[i] = console.nextInt();
            cumSum += tempArray[i];
        }
        determineAverage(numdays, tempArray, cumSum);
        coldHot(tempArray);
    }

    //Step4: determine the average Temp
    //this method determines the average temprature
    public static void determineAverage(int numdays, int[] tempArray, int cumSum) {
        double average = (double) cumSum / (double) numdays;
        average = Math.round(average * 10.0) / 10.0;
        System.out.println("Average temp = " + average);
        numAboveAverage(numdays, tempArray, average);
    }

    //Step5: determine the # of days above the average Temp
    //This method print the number of days that were above the average temp
    public static void numAboveAverage(int numdays, int[] tempArray, double average) {
        int aboveAverage = 0;
        for (int i = 0; i < numdays; i++) {
            if (tempArray[i] > average) {
                aboveAverage++;
            }
        }
        System.out.println(aboveAverage + " days were above average.");
    }

    //this method print the Array and determines the coldest and hottest days
    public static void coldHot(int[] tempArray) {
        System.out.println();
        System.out.println("Temperatures: " + Arrays.toString(tempArray));

        //Determines the coldest days
        int coldestA = Integer.MAX_VALUE;
        int coldestB =Integer.MAX_VALUE;

        for(int i = 0; i < tempArray.length; i++) {
            if(tempArray[i] < coldestA) {
                coldestB = coldestA;
                coldestA = tempArray[i];
            } else if (tempArray[i] < coldestB) {
                coldestB = tempArray[i];
            }
        }
        System.out.println("Two coldest days: " + coldestA + ", " + coldestB);
        //Determines the hottest days
        int hottestA = Integer.MIN_VALUE;
        int hottestB =Integer.MIN_VALUE;

        for(int i = 0; i < tempArray.length; i++) {
            if(tempArray[i] > hottestA) {
                hottestB = hottestA;
                hottestA = tempArray[i];
            } else if (tempArray[i] > hottestB) {
                hottestB = tempArray[i];
            }
        }
        System.out.println("Two hottest days: " + hottestA + ", " + hottestB);
    }
}