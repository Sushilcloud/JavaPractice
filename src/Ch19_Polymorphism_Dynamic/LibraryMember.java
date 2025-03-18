package Ch19_Polymorphism_Dynamic;

public class LibraryMember {
    String name;
     // constructor for LibraryMember
    public LibraryMember(String name)
    {
        this.name=name;
    }

    //Method to borrow books(overridden in subclasses)
    public void borrowBook()
    {
        System.out.println(name+"can borrow book");
    }
}
