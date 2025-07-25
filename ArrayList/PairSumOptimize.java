import java.util.ArrayList;
public class PairSumOptimize {
    public static Boolean PairSum(ArrayList<Integer> list,int target){
        //T.C-->O(n)
        int pivot=-1;
        int n=list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
                pivot=1;
                break;
            }
        }
        int lp=pivot+1;
        int rp=pivot;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)== target){
                return true;
            }

            if(list.get(lp)+list.get(rp) < target){
                lp=(lp+1)%n;
            }

            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();

        list.add(14);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        

        int target=17;

        System.out.println(PairSum(list, target));


    }
}
