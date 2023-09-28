
public class WrapperClassBoxing {
	public static void main(String [] args)
	{
//		Boxing -:
//		Boxing is the process of converting primitive datatype into Non-primitive datatype called as an boxing.
//		1.Implicit boxing or auto boxing:-
//		creating object for the wrapper class using he assignment operator or by literal way.
//		Integer i =10;
//		int  a =155;
//		Integer x =a;
//		System.out.println(i);  //10
//		System.out.println(a);   //155
//		System.out.println(x);   //155
		
		
		
		//Explicite Boxing-:
//		Creating object for the wrapper classes using the in-built methods of wrapper  class.
//		To perforn the explicite Boxing using in built method of wrapper class programmer need to take the help of inbuilt method valueOf().
		
//		Integer i = Integer.valueOf(155);
//		int a =100;
//		Integer x =Integer.valueOf(100);
//		System.out.println(i);
//		System.out.println(a);
//		System.out.println(x);
		
//		Another way to create object for explicite way is using the new keyword and wrapper class constructor.
		
		Integer i =new Integer(23);
		int num=90;
		Integer x =new Integer(num);
	
		
	}

}
