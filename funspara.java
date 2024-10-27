class funspara{
    void soap(int amount){
        System.out.println("soap purchased");
System.out.println(amount);
    }
    void powder(int amount){
        System.out.println("powder purchased");
System.out.println(amount);
    }
    void shampoo(int amount){
        System.out.println("shampoo purchased");
System.out.println(amount);
    }
    public static void main(String[] args) {
        funspara obj1= new funspara();
        funspara obj2= new funspara();
        funspara obj3= new funspara();
        obj1.soap(15);
        obj2.shampoo(65);
        obj3.powder(45);
    }
}