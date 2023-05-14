public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Add two: "+Add(10,20));
        System.out.println("Add two: "+Add(10,20,30));
    }
    public static int Add(int a,int b) {
        return a+b;
    }
    
    public static int Add(int a,int b,int c) {
        return a+b+c;
    }

}
