import java.util.ArrayList;
import java.util.List;

public class User 
  {
  private int userId;
  private String name;
  private List<Book> borrowedBooks;
   
  public User(int userId,String name)
  {
	  this.userId=userId;
	  this.name=name;
	  this.borrowedBooks=new ArrayList<>();
  }
  
  //getters
  public int getUserId()
  {
	  return userId;
  }
  public String getName()
  {
	  return name;
  }
  public List<Book> getBorrowedBook()
  {
	  return borrowedBooks;
  }
  
  // Borrow a book
  public void borrowBook(Book book)
  {
	  borrowedBooks.add(book);
  }
  
  //return a book
  
  public void returnBook(Book book)
  {
	  borrowedBooks.remove(book);
  }
  
  //show borrowed  Books
  
  public void showBorrowedBooks()
  {
	  if(borrowedBooks.isEmpty())
	  {
		  System.out.println("No books borrowed.");
	  }
	  else
	  {
		  System.out.println("Books borrowed by "+ name + ":");
		  for(Book book:borrowedBooks)
		  {
			  System.out.println("   -"+book);
		  }
	  }
  }

@Override
public String toString() {
	return "[" + userId + "] " + name + " (Borrowed: " 
                   + borrowedBooks.size() + " books)"  ;
}
  
  }
