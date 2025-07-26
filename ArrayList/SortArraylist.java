import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(9);
        list.add(3);
        list.add(15);
        list.add(4);

        System.out.println(list);

        Collections.sort(list);//Ascending Order

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());//Descending Order
        //Comparator-function logic

        System.out.println(list);
    }
}
