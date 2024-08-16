import java.util.Arrays;

public class leftrotate {

    public static void main(String[] args) {
        
        int ar[]={1,2,3,4,5};
        int n=3;
        int k=0;
        int rlft[]=new int[ar.length];
        for(int i=n;i<ar.length;i++)
        {
            rlft[k]=ar[i];
            k++;
        }
       int m=0;
        for(int  i=ar.length-n;i<ar.length;i++)
        {
            rlft[i]=ar[m]; 
            m++;
        }  
        System.out.println("Before left rotation");
        System.out.println(Arrays.toString(ar));
        System.out.println("After left rotation");
        System.out.println(Arrays.toString(rlft));
    }
    
}
