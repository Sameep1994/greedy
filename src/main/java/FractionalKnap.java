import java.util.Arrays;

public class FractionalKnap {
    public static void main(String[] args) {

        Item a[] ={new Item(10,60),
        new Item(40,40),
        new Item(20,100),
        new Item(30,120)};
        int W=50;
        System.out.println(fracKnap(a,W));
    }

    public static double fracKnap(Item[] a,int w){
        Arrays.sort(a);
        double res=0.0;
        for(int i=0;i<a.length;i++){
            if(a[i].wt<=w){
                res=res+(double)a[i].val;
                w=w-a[i].wt;
            }else {
                res=res+a[i].val*(double)w/(double)a[i].val;
                break;
            }
        }

        return res;
    }
}

class Item implements Comparable<Item>{
    int val,wt;

    public Item(int val, int w) {
        this.val = val;
        this.wt = w;
    }


    @Override
    public int compareTo(Item o) {
        return wt*(o.val)-(val)*(o.wt);
    }
}
