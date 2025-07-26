import java.util.ArrayList;

public class Swap {
    public static void Swapnum(ArrayList<Integer> list, int idx1,int idx3){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx3));
        list.set(idx3, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(77);
        list.add(2);
        list.add(78);
        list.add(3);
        list.add(79);

        int idx1=1,idx3=3;

        System.out.println(list);

        Swapnum(list, idx1, idx3);

        System.out.println(list);
        
    }
}
