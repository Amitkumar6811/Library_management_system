

import java.util.ArrayList;
import java.util.List;

public class Library 
  {
   private List<Book> books;
   private List<User> users;
    
    public Library()
    {
    	books=new ArrayList<>();
    	users =new ArrayList<>();
    }
   
    // Add books and users
    
    public void addBook(Book book)
    {
    	books.add(book);
    }
    public void addusers(User user)
    {
    	users.add(user);
    }
    
   //find by Id
    
    private Book findBook(int bookId)
    {
    	for(Book book:books)
    	{
    		if(book.getBookId()==bookId)
    			return book;
    	}
    	return null;
    }
    
    private User findUser(int userId)
    {
    	for(User user: users)
    	{
    		if(user.getUserId()==userId)
    			return user;
    	}
    	return null;
    }
    
    
    // Issue book
    
    public void issueBook(int bookId,int userId)
    {
    	Book book = findBook(bookId);
    	User user=  findUser(userId);
    	
    	if(book==null || user==null)
    	{
    		System.out.println("Book or User not found");
    		return;
    	}
    	
    	if(book.isIssued()) {
    		System.out.println("Book already Issued");
    	}
    	else
    	{
    		book.isIssued();
    		user.borrowBook(book);
    		System.out.println("Book is issued to "+ user.getName());
    	}
    }
    
    //Return Book
    
    public void returnBook(int bookId,int userId)
    {
    	Book book = findBook(bookId);
    	User user = findUser(userId);
    	
    	if(book==null||user==null)
    	{
    		System.out.println("Book or user not found! ");
    		return;
    	}
    	
    	if(user.getBorrowedBook().contains(book))
    	{
    		book.returnBook();
    		user.returnBook(book);
    		System.out.println("Book return by "+ user.getName());
    	}
    	else
    	{
    		System.out.println("This user has not borrowed this book.");
    	}
    }
    
    // show all books
    
    public void showAllBooks()
    {
    	System.out.println("Available book in the Library:");
    	for(Book book : books)
    	{
    		System.out.println("  -" + book);
    	}
    }
    
    public void showAllUsers()
    {
    	System.out.println("Registered users: ");
    	for(User user: users)
    	{
    		System.out.println("  -"+ user);
    	}
    }
    
  }
