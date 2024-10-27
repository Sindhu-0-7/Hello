

 class loopif {
 public static void main(String[] args) {
    int i=1;
    int oddcount=0;
    for(i=1;i<=10;i++){
        if(i % 2 == 0){
           // System.out.println(i);
        }
       else{
        
        oddcount =oddcount+1;
        System.out.println("odd number:"+i);
        System.out.println(oddcount);
       } 
       
 }
 System.out.println("total noof odd numbers"+oddcount); 
}
}
