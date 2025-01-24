
abstract class Animal {
    
    public abstract void sound();

    
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}


class Dog extends Animal {
    
    public void sound() {
        System.out.println("The dog is human friendly.");
    }
}

class Cat extends Animal {
   
    public void sound() {
        System.out.println("The cat lazy.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        
        myDog.sound(); 
        myCat.sound(); 

       
        myDog.sleep();  
        myCat.sleep();  
    }
}
