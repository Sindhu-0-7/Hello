public class funcpara {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }

    
    public static void main(String[] args) {
        funcpara a =new funcpara();
        a.sum(30,20);
        funcpara b =new funcpara();
        b.sub(30,20);
        funcpara c =new funcpara();
        c.mul(30,20);
        funcpara d =new funcpara();
        d.div(30,20);
        
    }
}
