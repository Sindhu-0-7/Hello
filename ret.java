class ret{
    int sum(int a,int b){
        int add=a+b;
        return add;
    }
    String getname(){
        
        return "Sindhu";
    }
    public static void main(String[] args){
        ret a=new ret();
        
        int  addition=a.sum(50,40);

          
          a.getname();
          String name=a.getname();
        
    System.out.println(addition);
    System.out.println(name);
    }
}