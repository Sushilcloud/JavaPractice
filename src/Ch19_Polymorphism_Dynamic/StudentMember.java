package Ch19_Polymorphism_Dynamic;

public class StudentMember extends LibraryMember {
    // constructor for StudentMember
    public StudentMember(String name)
    {
        super(name);  // call the constructor of base class

    }

    @Override  // override the borrowbook method for StudentMember class
    public void borrowBook()
    {
        System.out.println(name+"can borrow upto 3 book");
    }
}
