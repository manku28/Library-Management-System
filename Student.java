public class Student 
{
 String Name;
 int Class;
 int LibId;
 int Bookissued;
 
public Student(String name, int class1, int Id, int issued)
{
    this.Name = name;
    this.Class = class1;
    this.LibId = Id;
    this.Bookissued = issued;
}

public void getDetails()
{
   System.out.println("NAME: " + this.Name +" "+ "Class: " + this.Class +" "+ "LibId: " + this.LibId +" "+ "Bookissued: " + this.Bookissued +" ");
}

public void issueBook(Book obj)
{
     this.Bookissued++;
     obj.issued=true;
     System.out.println("issued");
}
public void returnBook(Book b)
{
  this.Bookissued--;
  b.issued = false;
  System.out.println("returned");
}
}
