package Ch19_Polymorphism;

public class Main {
    public static void main(String[] args)
    {
        Dog myDog=new Dog("Romi","Bhotia");

        // ploymorphism
        Animal myDog2=new Dog("Kitti","Locale");

        // myDog2 behave like an animal

        // polymorphic method call
        myDog2.eat();    // animal can do
        myDog2.makeSound(); // animal can do
        myDog2.sleep(); // animal can do
        // myDog2.walk();  // will show error message

        // direct call of subclass specific method
        // require casting to the appropriate subclass
        ((Dog) myDog2).walk();

        myDog.eat();
        myDog.makeSound();
        myDog.sleep();

        Bird myBird=new Bird("sonu");
        myBird.fly();
        myBird.makeSound();

    }
}
