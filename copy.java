
import java.util.Arrays;

public class copy{
    public static void main(String[] args) {
        int ar[]={1,5,98,3,6,4,7};
        int cpy[]= new int[ar.length];

        for(int i=0;i<ar.length;i++)
        {
            cpy[i]=ar[i];
        }
        System.out.println("Original array");
        System.out.println(Arrays.toString(ar));
        System.out.println("Copied array");
        System.out.println(Arrays.toString(cpy));
        
    }
}