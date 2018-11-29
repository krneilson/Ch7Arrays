package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.Scanner;

public class KimballNeilsonPersonalityTest {
    public static void main(String[] args) throws FileNotFoundException{
        userInput();
    }

    //this method asks the user for a input file and output file;
    public static void userInput() throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        // Asks the user for a input file
        System.out.print("Input File name: ");
        File input = new File(console.nextLine());
        //prompts the user again if the file is not found
        while(!input.canRead()) {
            System.out.print("file not found. Try again: ");
            input = new File(console.nextLine());
        }
        //Asks the user for the output file
        System.out.print("Output file name: ");
        String outputName = console.nextLine();
        PrintStream outputStream = new PrintStream(new File(outputName));
        System.out.println();
        proceessFile(input, outputStream);
    }

    //this method processes the file and outputs the answers
    private static void proceessFile(File input, PrintStream outputStream) throws FileNotFoundException {
        // TODO Auto-generated method stub
        Scanner file = new Scanner(input);
        while(file.hasNextLine()) {
            String name = file.nextLine();
            outputStream.println(name +":");
            String answers = file.nextLine();
            calculate(answers, outputStream);
        }
    }

    private static void calculate(String answers, PrintStream outputStream) {
        // TODO Auto-generated method stub
        int[][] array = new int[4][2];
        answers = answers.toLowerCase();
        //gets the number of a and b for the first dimension
        for(int i = 0; i < 70; i += 7) {
            if(answers.charAt(i) == 'a') {
                array[0][0]++;
            }
            else if(answers.charAt(i) == 'b') {
                array[0][1]++;
            }
        }
        //second dimension
        for(int i = 1; i < 70; i += 6) {
            if(answers.charAt(i) == 'a') {
                array[1][0]++;
            }
            else if(answers.charAt(i) == 'b') {
                array[1][1]++;
            }
            i++;
            if(answers.charAt(i) == 'a') {
                array[1][0]++;
            }
            else if(answers.charAt(i) == 'b') {
                array[1][1]++;
            }
        }
        //third dimension
        for(int i = 3; i < 70; i += 6) {
            if(answers.charAt(i) == 'a') {
                array[2][0]++;
            }
            else if(answers.charAt(i) == 'b') {
                array[2][1]++;
            }
            i++;
            if(answers.charAt(i) == 'a') {
                array[2][0]++;
            }
            else if(answers.charAt(i) == 'b') {
                array[2][1]++;
            }
        }
        // fourth dimension
        for(int i = 5; i < 70; i += 6) {
            if(answers.charAt(i) == 'a') {
                array[3][0]++;
            }
            else if(answers.charAt(i) == 'b') {
                array[3][1]++;
            }
            i++;
            if(answers.charAt(i) == 'a') {
                array[3][0]++;
            }
            else if(answers.charAt(i) == 'b') {
                array[3][1]++;
            }
        }

        //printing the number of A and B for the dimensions
        for(int i = 0; i <=3; i++) {
            outputStream.print(array[i][0] + "A-" + array[i][1] + "B ");
        }

        outputStream.println();

        //Variables that store the letters for each dimension
        String d1 = "X";
        String d2 = "X";
        String d3 = "X";
        String d4 = "X";

        //calculating percentages and printing
        outputStream.print("[");
        for(int i = 0; i <=3; i++) {
            double total = array[i][0] + array[i][1];
            double percent = (array[i][1]/total) * 100;
            outputStream.print((int)percent+"%, ");
            //the following code identify the letter for each dimension
            //first dimension
            if(i == 0) {
                if(percent > 50.0) {
                    d1 = "I";
                }
                else if(percent < 50.0) {
                    d1 = "E";
                }
            }
            //second dimension
            else if(i == 1) {
                if(percent > 50.0) {
                    d2 = "N";
                }
                else if(percent < 50.0) {
                    d2 = "S";
                }
            }
            //third dimension
            else if(i == 2) {
                if(percent > 50.0) {
                    d3 = "F";
                }
                else if(percent < 50.0) {
                    d3 = "T";
                }
            }
            //fourth dimension
            else if(i == 3) {
                if(percent > 50.0) {
                    d4 = "P";
                }
                else if(percent < 50.0) {
                    d4 = "J";
                }
            }
        }
        outputStream.print("] = ");

        //prints the letters for that person
        outputStream.println(d1+d2+d3+d4);
        outputStream.println();




    }
}