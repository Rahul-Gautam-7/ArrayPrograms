public class frequency {
    public static void main(String[] args) {
        
        int ar[]={1,2,1,2,2,2,34,2,1,5,6,8,6,3};
        int fe[]= new int[ar.length];
        int visited=-1;

        for(int i=0;i<ar.length;i++)
        {
            int freq=1;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    freq++;
                    fe[j]=visited;
                }
            }
            if(fe[i]!=visited)
            {
                fe[i]=freq;
            }
        } 
        for(int i=0;i<fe.length;i++)
        {
            if(fe[i]!=visited)
            {
                System.out.println("Number "+ar[i]+" is occured "+fe[i]+" times");
            }
        }
    }
}
