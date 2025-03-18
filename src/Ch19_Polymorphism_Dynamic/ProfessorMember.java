package Ch19_Polymorphism_Dynamic;

public class ProfessorMember extends LibraryMember{
    // constructor
    public  ProfessorMember(String name)
    {
        super(name);
    }
    public void borrowBook()
    {
        System.out.println(name+"can borrow upto 10 book");
    }
}
