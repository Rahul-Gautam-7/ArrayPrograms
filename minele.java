import java.util.*;
public class minele {
    
    public static void main(String[] args) {
        int ar[]={23,4,2,12,454,565,23,1};

        //method 1
        Arrays.sort(ar);
        System.out.println(ar[0]);


        //method 2
        int min =ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
            {
                min = ar[i];
            }
        }
        System.out.println(min);

    }
}
