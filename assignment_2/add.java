
class A {
    void add (int i,int j){
     System.out.println(i+j);
     }
     void add (short i,short j){
         System.out.println(i+j);
     }
     void add (int i,float j){
         System.out.println(i+j);
     }
     void add (float i,int j){
         System.out.println(i+j);
     }
 
 }
 public class add {
     public static void main(String[] args) {
         A a = new A();
         a.add(1,2.0f);
         
     }
 }
 