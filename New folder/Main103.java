import java.util.Scanner;

class Main103
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s1 = sc.nextLine();
       // System.out.println("Enter the String :");
       
        for(int i = 0;i<s1.length();i++)
        {
            int count=0;
         for(int j =i+1;j<s1.length();j++)
         {
             char ch1 =s1.charAt(i);
             char ch2= s1.charAt(j);
             if(ch1==ch2 && i!=j)
             {
                 count++;
             }
         }
         if(count==1)
         {
             System.out.println(s1.charAt(i));
         }
         
         
        }
        
    }
}
