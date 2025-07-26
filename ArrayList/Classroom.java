import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        //ArrayList--->Java Collection Framework
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<String> list1= new ArrayList<>();
        ArrayList<Boolean> list2= new ArrayList<>();

        list.add(1);//O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // int element=list.get(2);-->O(1)
        // System.out.println(element);

        // list.remove(3);//O(n)
        // System.out.println(list);

        // list.set(2, 77);//O()
        // System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(40));
        // list.set(3, 99);
        // System.out.println(list);
    }
}
