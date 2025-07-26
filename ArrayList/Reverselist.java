import java.util.ArrayList;

public class Reverselist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(77);
        list.add(2);
        list.add(78);
        list.add(3);
        list.add(79);

        System.out.println(list);

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
