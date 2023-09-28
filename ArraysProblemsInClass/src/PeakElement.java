
//{ Driver Code Starts
import java.util.*;
class PeakElement
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n)
    {
       //add code here.
    //   int a[]= {1,2,3};
    if(a[0]>a[1])
      //System.out.println(a[0]);
      return a[0];
    
    if(a[n-1]>a[n-2])
      //System.out.println(a[n-1]);
      return a[n-1];
    
    for(int i =1;i<n-1;i++)
    {
      if(a[i-1]<a[i] && a[i]> a[i+1])
      
      //  System.out.println(a[i]);
      return a[i];
    }
    
    return -1;
    }
    
    
     public static void main(String[] args)
    {
    	 PeakElement s =  new PeakElement();
        int arr[]= {1,2,3,1};
        int n =arr.length;
       System.out.println(s.peakElement(arr,n));
    }
    
   
    
}

