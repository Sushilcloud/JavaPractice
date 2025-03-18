package Ch19_Polymorphism;

public class Bird extends Animal{

    public Bird(String name)
    {
        super(name);
    }

    void fly()
    {
        System.out.println("the bird can fily");
    }
    @Override
    void eat()
    {
        super.eat();
        System.out.println("the bird can eat");
    }
    @Override
    void makeSound()
    {
        System.out.println("the make can chirping");
    }
}
