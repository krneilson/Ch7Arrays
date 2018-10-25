package Ch7Arrays;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args){
        multTable();
    }

    public static void multTable(){
        int[][] table = new int[10][10];
        for(int row = 0; row < table.length; row++){
            for(int col = 0; col < table[row].length; col++){
                table[row][col]= (row+1)*(col+1);
                System.out.print(table[row][col] +" \t");

            }
            System.out.println();
        }

    }
}
