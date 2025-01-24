class A {
    A display() {
        System.out.println("This is display of A method");
        return this;
    }
}

class B extends A {
    @Override
    B display() {
        System.out.println("This is display of B method");
        return this;
    }
}

public class abc {
    public static void main(String[] args) {
        A a = new A();
        a.display();  // This will work fine with A's method
        
        B b = new B();
        b.display();  // This will work fine with B's method
        
        // Optional: You can also do this:
        A a2 = new B();  // Using a reference of type A, but it will call B's display() due to polymorphism
        a2.display();
    }
}   