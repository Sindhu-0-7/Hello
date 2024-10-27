import java.util.Scanner;
class q4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("the given num is divisible by 3&5");
        }
        else{
            System.out.println("the given num  is not divisible by 3&5");
        }
    }
}