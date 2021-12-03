import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumberMain {
    public static void main(String[] args){
        for(int i = 2;i <= 10; i ++){
            System.out.println("Prime Numbers less than or equal to " +i+" = "+Arrays.toString(getPrimeNumber(i)));

        }
    }
    private static Integer[] getPrimeNumber(final int n){
        ArrayList<Integer> array = new ArrayList<>();
        int i = 2,index = 0;
        boolean isPrime = true;
        while (i <= n) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
                continue;
            }
            if (isPrime == true)
                array.add(i);
            i++;
        }
        Integer [] prime = new Integer[array.size()];
        int size = 0;
        for(Integer s : array){
            prime[size++] = s;
        }
        return prime;
    }
}

