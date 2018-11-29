package Ch7Arrays;

//this program determines the most frequent digit in a number.
public class KimballNeilsonMode {
    public static void main(String[] args){

        //number can be set to the desired number by commenting line 9 out
        int num = 669360267;
        //num = 5713523;
        //program is using the number from the tie example
        System.out.println("Mode is: " + goodmode(num));
    }

    //this method determines the most frequent digit
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