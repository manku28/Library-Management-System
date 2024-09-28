class Book
{
  String Title;
  String Author;
  int Code;
  int Price;
  boolean issued = false;
  private Object bookUpdate;  
    
 public Book(String title, String author, int code, int price)
 {
    this.Title = title;
    this.Author = author;
    this.Code = code;
    this.Price = price;
    }

    public void updateBook(String title, String author, int code, int price)
    {
      this.Title = title;
      this.Author = author;
      this.Code = code;
      this.Price = price;
    }
public static void main(String[] args)
{
    Book myobj = new Book("Core Java", "Mc Graw Hill", 4679, 350);
    System.out.println("Title: " + myobj.Title+" "+ "Author: " + myobj.Author+" "+ "Code: " + myobj.Code+" "+ "Price: " + myobj.Price+" "+ "Book Issued: " + myobj.issued);
   

    Student std1 = new Student("Ankit", 11, 101, 0);
    std1.issueBook(myobj);

    std1.getDetails();
    System.out.println("Title: " + myobj.Title+" "+ "Author: " + myobj.Author+" "+  "Code: " + myobj.Code+" "+ "Price: " + myobj.Price+" "+ "Book Issued: " + myobj.issued);

     std1.returnBook(myobj);
     std1.getDetails();
     System.out.println("Title: " + myobj.Title+" "+ "Author: " + myobj.Author+" "+  "Code: " + myobj.Code+" "+ "Price: " + myobj.Price+" "+ "Book Issued: " + myobj.issued);        

      myobj.updateBook("Python", "Wes McKinney", 5920, 400);
      System.out.println("Title: " + myobj.Title+" "+ "Author: " + myobj.Author+" "+ "Code: " + myobj.Code+" "+ "Price: " + myobj.Price+" "+ "Book Issued: " + myobj.issued);
    }
}

 