import java.util.Scanner;
class find{
    String evenorodd(int num1){
          if(num1%2==0){
            
            return "even";
          }
          else {
            return "odd";
          }
          
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1=scan.nextInt();
        find obj1=new find();
        String ans=obj1.evenorodd(num1);

        System.out.println(ans);
       
        

    }
}