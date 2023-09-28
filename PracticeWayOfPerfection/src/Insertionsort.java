import java.util.Arrays;

public class Insertionsort {
    
    public void insertion(int a[])
    {
        for(int i = 1; i < a.length; i++)
        {
            int key = a[i];
            int j = i; // Corrected variable name to 'j'
            
            // Shift elements greater than key to the right
            while (j > 0 && key < a[j - 1])
            {
                a[j] = a[j - 1];
                j--;
            }
            
            // Insert key at the correct position
            a[j] = key;
        }
    }
    
    public static void main(String [] args)
    {
        int a[] = { 9, 5, 1, 4, 3 };
        Insertionsort i = new Insertionsort();
        i.insertion(a);
        System.out.println(Arrays.toString(a));
    }
}
