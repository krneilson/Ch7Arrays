package Ch7Arrays;

public class KimballNeilsonMode {
    public static void main(String[] args){
        int num = 669360267;
        num = 5713523;
        System.out.println("Mode is: " + goodmode(num));
    }

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
