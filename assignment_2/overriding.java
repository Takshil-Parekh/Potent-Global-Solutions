// Parent class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the method in the parent class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myDog = new Dog(); // Create a Dog object

        myAnimal.sound(); // Calls the method in Animal class
        myDog.sound(); // Calls the overridden method in Dog class
    }
}
