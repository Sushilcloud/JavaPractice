package Ch18_Inheritance;

public class Main {
    /*
Inheritance in java
    Definition:-  inheritance in oop allows one class to inherit properties and method from another, promoting code
                  reusability and creating a natural class hierarchy.

    Analogy:    The Family Tree
                A:  Parent Class(superclass) Like a parent passing down talent(methods\properties) to their child
                B:  Child Class(subclass)   Inherit the parent traits but can also devlop unique abilites (additional
                method and properties)

    Superclass: (Parent Clas)   The super class is the base class that other classes inherit from.
                                its contain common properties and method , like an Animal class with species, age,
                                eat() and sleep()

    Subclass:   (child class)   The subclass inherits from the superclass and can add or customize feature. for
                                example a Dog class extends Animal with breed and bark() and may override eat() for
                                specific behaviour.


   for instance while all animals eat the way a dog eats might differ from a bird eat, so the dog class might override
   the eat method to reflect this.

   IS-A Relationship

   The IS-A relationship defines how subclasses relate to their superclasses, indicating that a subclass is a
   specific type of the superclass

   Understanding IS_A
        Concept:    A subclass can be treated as an instance of its superclass . for example a Dog IS-A Animal
                    meaning a Dog can be used wherever an Animal is expected

        Benifit:    Enables polymorphism , allowing methods designed for a superclass to accept any subclass without
                    modification.

    Examples:   Animal Class:   Contains common properties like species and methods like eat() and sleep()
                Dog Class:      Inherit from Animal class and add specific properties like breed and method like
                                back().

*/
}
