import java.util.Scanner;
class q5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if(score<50){
            System.out.println("you neeed to imrove ");
        }
        else if( score==50 ||score<50 &&score<70 ) {
            System.out.println("good job");
        }
        else if(score <70) {
            System.out.println("excellent");
        }
    }
}