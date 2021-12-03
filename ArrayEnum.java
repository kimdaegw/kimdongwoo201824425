import java.util.*;

enum Command{ADD,LIST,SRTA,SRTD,SUM,QUIT,INVALID};
enum Order{ASC,ABC};
public class ArrayEnum {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        int []values = new int[100];
        int index = 0;
        while(true){
            final Command command = getCommand(sc);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch(command){
                case ADD:
                    final int newValue = getValue(sc);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case SRTA:
                    printList(sort(values, index, Order.ASC), index);
                    break;
                case SRTD:
                    printList(sort(values, index, Order.ABC), index);
                    break;
                case SUM:
                    Sum(values,index);
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        sc.close();
    }
    private static Command getCommand(Scanner x){
        String str = x.next().toUpperCase(Locale.ROOT);
        Command cmd;
        if(str.equals("ADD")||str.equals("LIST")||str.equals("SRTA")
                ||str.equals("SRTD")||str.equals("SUM")||str.equals("QUIT"))
              cmd = Command.valueOf(str);
        else cmd = Command.INVALID;
        return cmd;
    }
    private static int getValue(Scanner y){
        int a = y.nextInt();
        return a;
    }
    private static void printList(int[] b,int c){
        for(int i=0;i<c;i++)
            System.out.print(b[i]+" ");
        System.out.println("");
    }
    private static int[] sort(int[] b,int c, Order d){
        int []arr = new int[100];
        arr = b;
        if(d == Order.ASC) {
            for(int i=0;i<c;i++)
                for(int j=i+1;j<c;j++){
                    if(arr[i]>arr[j]){
                        int tmep = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmep;
                    }
                }
        }
        if(d == Order.ABC){
            for(int i=0;i<c;i++)
                for(int j=i+1;j<c;j++) {
                    if (arr[i] < arr[j]) {
                        int tmep = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmep;
                    }
                }
        }


        return arr;
    }
    private static void Sum(int []b,int c){
        int sum = 0;
        for(int i=0;i<c;i++)
            sum = sum+b[i];
            System.out.println(sum);

    }
}
