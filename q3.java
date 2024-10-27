import java.util.Scanner;
class q3{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int salary = scan.nextInt();
       if(salary < 7000){
        System.out.println("scholarship is available");
       }
       else{
        System.out.println("scholarship is not available");
       }
    }
}