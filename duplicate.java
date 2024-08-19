import java.util.HashMap;

public class duplicate {

    public static void findDuplicates(int ar[])
    {
        //hashmap only allows unique key to insert
        HashMap<Integer,Integer> lst = new HashMap<>();
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j] )
                {
                    lst.put(ar[i], ar[i]);
                    
                }
            }
        }
       System.out.println(lst.values());   
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,1,2,2,2,3,4,5,6756,342,1,4,6756,12};
        findDuplicates(ar);     
    }
}
