import java.util.Arrays;
import java.util.Scanner;

public class MathMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int a = sc.nextInt();
        int [] inputs = new int[a];

        for(int i = 0; i < a; i++){
            inputs[i] = sc.nextInt();
        }
        int max = getMax(inputs);
        System.out.printf("Max element : %d in %s%n", max, Arrays.toString(inputs));

        int min = getMin(inputs);
        System.out.printf("Min element : %d in %s%n", min, Arrays.toString(inputs));

    }

    private static int getMax(int[] inputs){
        int max = 0;
        for(int i : inputs){
            if (max < i) max = i;
        }
        return max;
    }

    private static int getMin(int[] inputs){
        int min = 89999999;
        for(int i : inputs){
            if(min > i) min = i;

        }
        return min;
    }
}