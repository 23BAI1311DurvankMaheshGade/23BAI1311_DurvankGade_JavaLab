public class APP2{
	public static void main(String[] args){
		int myint=9;
		double mydouble=myint;
		//Widening Casting
		System.out.println(myint+"\n");
		System.out.println(mydouble+"\n");
		//Narrow casting
		mydouble= 9.78d;
		myint=(int) mydouble;
		System.out.println(mydouble+"\n");
		System.out.println(myint+"\n");
}}
