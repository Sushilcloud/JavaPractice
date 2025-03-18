package Ch19_Polymorphism_Dynamic;

public class Main {
    public static void main(String[] args)
    {
        // Create an array for LibraryMemeber objects

        LibraryMember[] members=new LibraryMember[3];

        // initialize of array with different types of member
        members[0]=new LibraryMember("Susihl"); // Base Class
        members[1]=new ProfessorMember("Rawat Sir");
        members[2]=new StudentMember("Shivansh");

        // iterate through the array and call borrowbook method for

        for (LibraryMember member: members){
            member.borrowBook(); // Dynamic method dispatch in action
        }
    }
}
