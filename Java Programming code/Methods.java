public class Methods{
	public static void main(String[] args){
		int num1=10;
		int num2=20;
		int sum=num1+num2;
		System.out.println("The sum: "+sum+" Add func: "+new Methods().Add(30,40));
	}
	public  int Add(int num1,int num2){
		return num1+num2;
	}
}