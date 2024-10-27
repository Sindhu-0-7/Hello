public class methodoverload {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        methodoverload obj1=new methodoverload();
        obj1.sum(12,30);
        obj1.sum(90,50,60);
    }
}
