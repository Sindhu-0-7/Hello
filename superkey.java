
 class animal{
    int age=23;
	  animal(String name){
		 System.out.println("animal makes sound");
	 }
     void makesound(){
        System.out.println("sound");
     }
 }
 
 
 class dog extends animal{
	 dog(){
        super("names of animal");
        super.makesound();
		System.out.println("barks");
        System.out.println(super.age);
		}
 }
public class superkey {
	public static void main(String[] args ) {
 dog obj1 = new dog(); 
	}
}

