import java.util.Scanner;


class equal
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        
        if(a==b){
            System.out.println("two numbers are equal");
        }
        else{
            System.out.print("two num are not equal");
        }
    }
}