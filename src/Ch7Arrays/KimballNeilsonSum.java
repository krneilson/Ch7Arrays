package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//this program takes a external file and adds all the number on a line and prints its sum.
public class KimballNeilsonSum {
    public static final int lenght = 25;
    public static void main(String[] args) throws FileNotFoundException{
        fileProceser();

    }

    public static void fileProceser() throws FileNotFoundException {
        Scanner file = new Scanner(new File("sum.txt"));
        int nON = 0;
        while(file.hasNextLine()){
            String line = file.nextLine();
            for(int i = 0; i < line.length() - 1; i++){
                if(line.charAt(i) == ' ' && Character.isLetter(line.charAt(i+1)) ){
                    nON++;
                }
            }
            makeArray();
        }
    }
}
