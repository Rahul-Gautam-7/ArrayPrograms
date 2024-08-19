import java.util.*;
public class maxele {
    public static void main(String[] args) {
        
        int ar[]={23,4,2,12,454,565,23,1};

        //method 1
        Arrays.sort(ar);
        System.out.println(ar[ar.length-1]);


        //method 2
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println(max);


    }
}
