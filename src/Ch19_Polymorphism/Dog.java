package Ch19_Polymorphism;

public class Dog extends Animal{
    String breed;
    public Dog(String name,String breed)
    {
        super(name);
        this.breed=breed;
        System.out.println("Dog Constructor called! the breed is "+breed);
    }
    @Override
    void eat()
    {
        super.eat();
        System.out.println("The dog eats food");
    }
    void animalEat()
    {
        super.eat();
    }
    @Override
    void makeSound()
    {
        System.out.println("The dog barks");
    }
    void walk()
    {
        System.out.println("he an run fast");
    }
}
