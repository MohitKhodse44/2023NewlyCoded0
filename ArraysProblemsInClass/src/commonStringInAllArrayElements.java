public class commonStringInAllArrayElements {
    public static void main(String[] args) {
        String[] s1 = {"flower", "florida", "flowable"};
        String s4 = "";

        for (int i = 0; i < s1[0].length(); i++) 
        {
        	for(int j=i+1;j<s1[0].length();j++)
        	{
        		String s3=s1[0].substring(i,j);
        		boolean common=true;
        		
        		for(int k =0;k<s1.length;k++)
        		{
        			if(!s1[k].contains(s3))
        			{
        				common=false;
        				break;
        			}
        		}
        		if(common&& s3.length()>s4.length()) {
        		s4=s3;
        		}
        		
        		
        	}
            
        }

        System.out.println(s4);
    }
}
