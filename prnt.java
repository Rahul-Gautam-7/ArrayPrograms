import java.util.*;
public class prnt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ar[] = new int[5];

        for(int i=0;i<ar.length;i++)
        {
            System.out.print("Enter value "+i+" : ");
            ar[i]=sc.nextInt();
        }


        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+",");
        }

        // System.out.println(Arrays.toString(ar));
    }
}