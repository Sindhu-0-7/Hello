public class thiskey {
    String myname=null;

    thiskey(){
        System.out.println("hello");
    }
    void student( String myname){
        this.myname=myname;
    }
    public static void main(String[] args) {
        thiskey obj1=new thiskey();
    obj1.student("sindhu");
    System.out.println(obj1.myname);
    }
}
