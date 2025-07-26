import java.util.ArrayList;
import java.util.Scanner;

public class Monotonic {
    public static Boolean MonotonicCode(ArrayList<Integer> num) {
        if(num==null || num.size()<=1){
            return true;
        }
        boolean isIncreasing=true;
        boolean isDecreasing=true;

        for(int i=0;i<num.size()-1;i++){
            if(num.get(i)>num.get(i+1)){
                isIncreasing=false;
            }

             if(num.get(i)<num.get(i+1)){
                isDecreasing=false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        System.out.print("Enter the Number You want to Add: ");
        int total = sc.nextInt();
        System.out.print("Enter " + total + " numbers: ");

        for (int i = 0; i < total; i++) {
            int n = sc.nextInt();
            num.add(n);
        }

        System.out.println("The ArrayList Contains: " + num);

        boolean res=MonotonicCode(num);
        System.out.println("Is The List Monotonic?: "+ res);

    }
}
