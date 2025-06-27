public class Book 
  {
  private int bookId;
  private String title;
  private String auther;
  private boolean isIssued;
   
  public Book(int bookId,String title,String auther)
  {
	  this.bookId=bookId;
	  this.title=title;
	  this.auther=auther;
	  this.isIssued=false;
  }
  
  // getter
  public int getBookId()
  {
	  return bookId;
  }
  
  public String getTitle()
  {
	  return title;
  }
  
  public String getAuther()
  {
	  return auther;
  }
  
  public boolean isIssued()
  {
	  return isIssued;
  }
  
  //Method to issue or Return book
  
  public void issueBook()
  {
	  isIssued=true;
  }
  public void returnBook()
  {
	  isIssued=false;
  }

@Override
public String toString() {
	return "[" + bookId + "] "+ title + "by " + auther 
			   + (isIssued ? "(Issued)" : " (Available)");
}
  
  
 }
