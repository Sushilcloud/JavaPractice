package Ch19_Polymorphism;

public class Animal {
    String name;

    public Animal(String name){
        this.name=name;
        System.out.println("Animal constructor call for "+name);

    }

        void eat()  // another method for eat
        {
        System.out.println("This Animal eat food");
        }

        void sleep()
        {
            System.out.println("is sleeping");
        }

        void makeSound()
        {
            System.out.println("is making a sound");
        }
}

