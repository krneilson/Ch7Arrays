package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan1=new Scanner(new File("text1.txt"));
        Scanner scan2=new Scanner(new File("text2.txt"));

        ArrayList<String> list1 = getWords(scan1);
        ArrayList<String> list2 = getWords(scan2);

        //prints both data files of unique words
        System.out.println(list1);
        System.out.println(list2);

        //get the overlap of the two lists
        ArrayList<String> common = getOverLap(list1, list2);
        System.out.println(common);

        //calculate the percent overlap
        double list1Percent = getPercentOverLap(common, list1);
        double list2Percent = getPercentOverLap(common, list2);
        System.out.println(list1Percent);
        System.out.println(list2Percent);
    }

    public static ArrayList<String> getWords(Scanner scan){
        ArrayList<String> words=new ArrayList<String>();
        while(scan.hasNext())
            words.add(scan.next().toLowerCase());
        Collections.sort(words);
        //eliminate duplicates
        ArrayList<String> unique=new ArrayList<>();
        if(words.size()>0){
            unique.add(words.get(0));
            for(int i=1;i<words.size();i++){
                if(!words.get(i).equals(words.get(i-1)))
                    unique.add(words.get(i));
            }
        }
        return unique;
    }

    public static ArrayList<String> getOverLap(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> overlap = new ArrayList<String>();
        int i1 = 0;
        int i2 = 0;
        while( (i1 < list1.size()) && (i2 < list2.size()) ){
            int comparison = (list1.get(i1)).compareTo(list2.get(i2));
            if( comparison == 0 ){
                overlap.add(list1.get(i1));
                i1++;
                i2++;
            }
            else if( comparison < 0 ){
                i1++;
            }
            else {
                i2++;
            }
        }
        return overlap;
    }

    public static double getPercentOverLap(ArrayList<String> common, ArrayList<String> list){
        return ((double)common.size())/list.size()*100.0;
    }
}
