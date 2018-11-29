package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//this program takes a external file and adds all the number on a line and prints its sum.
public class KimballNeilsonSum {
    public static final int length = 25;
    public static void main(String[] args) throws FileNotFoundException{
        fileProceser();

    }
    //this method processes the file and prints the answers
    public static void fileProceser() throws FileNotFoundException {
        int counter = 0;
        Scanner file = new Scanner(new File("sum.txt"));
        int nON = 0;
        int j = 1;
        while(file.hasNextLine()){
            String line = file.nextLine();
            for(int i = 0; i < line.length() - 1; i++){
                if(line.charAt(i) == ' ' && Character.isDigit(line.charAt(i+1))){
                    nON++;
                }
            }
            int[][] array = makeArray(nON);
            populate(array, line);
            String sum = add(array);
            //the following code prints the lines
            Scanner tokenizer = new Scanner(line);
            String tokin = tokenizer.next();
            System.out.print(tokin);
            while(tokenizer.hasNext()) {
                tokin = tokenizer.next();
                System.out.print(" + " + tokin);
            }
            System.out.println(" = "+ sum);
            nON = 0;
            counter++;

        }
        System.out.println();
        System.out.println();
        System.out.println("Total lines = " + counter);
    }
    //this method creates the 2D array for this problem
    public static int[][] makeArray(int nON) {
        int[][]array = new int[nON+1][length];
        return array;
    }

    //this  method populates the array
    public static void populate(int[][] array, String line) {
        String al = "";
        Scanner tokenizer = new Scanner(line);
        while(tokenizer.hasNext()) {
            for(int row = 0; row < array.length; row++) {
                String tokin = tokenizer.next();
                for(int i = 0; i < 25 - tokin.length(); i++) {
                    al += "0";
                }
                al = al + tokin;

                for(int column = 0; column < array[row].length; column++) {
                    array[row][column] = Character.getNumericValue(al.charAt(column));

                }

                al = "";
            }

        }

    }

    //this method adds the numbers together and converts it to a int
    public static String add(int[][] array) {
        int adder = 0;
        int holder = 0;
        int[] sum = new int[length];

        for(int i = length -1; i >= 0; i--) {
            for(int row = 0; row < array.length; row++) {

                adder += array[row][i];
            }

            sum[i] = (adder + holder/10);
            holder = 0;
            int holder2 = sum[i];
            if(sum[i]>9) {
                sum[i] = sum[i] % 10;
                holder = holder2 - sum[i];
            }
            adder = 0;


        }

        String sum2 = "";
        int index = -1;
        for(int j = 0; j < length; j++) {
            if(sum[j] != 0) {
                index = j;
                break;
            }
        }
        if(index == -1) {
            return "0";
        }
        for(int j = index; j < length; j++) {
            sum2 += sum[j];
        }

        return sum2;
    }


}