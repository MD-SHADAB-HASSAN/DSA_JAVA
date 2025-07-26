import java.util.ArrayList;

public class Maxnum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(99);
        list.add(109);
        list.add(1000);

        System.out.println(list);
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < list.size()-1; i++) {
            if(max<list.get(i)){
                max=list.get(i);
                
            }
            // max=Math.max(max, list.get(i));
        }
        System.out.print("The Max Num Is: "+ max);
    }
}
