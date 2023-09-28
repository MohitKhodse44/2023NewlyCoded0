
class NonRepetativeNumbers
{
    public static void main(String [] args)
    {
        int a[]={1,2,3,4,5,6,6,8,9,1,2,3,4,5,};
        
        for(int i =0;i<a.length;i++)
        {
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]!=a[j])
                {
                    count++;
                }
            }
            if(count==a.length-1){
                System.out.print(a[i]+" ,");
            }
        }
        
        
    }
}