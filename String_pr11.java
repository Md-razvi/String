public class String_pr11 {
 public static void main(String[] args) {
     String sd="Maxwell@Tennison";
     String newAray[]=sd.split("@",2);
     for(String a: newAray)
     {
        System.out.println(a);
     }

 }   
}
