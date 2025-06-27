
import java.util.Scanner;

public class Main 
  {
    public static void main(String[] args) 
    {
		Library library=new Library();
		Scanner sc=new Scanner(System.in);
		
		
		// preloaded Books
		library.addBook(new Book(101, "Wing of Fire", "A.P.J Abdul Kalam"));
		library.addBook(new Book(102, "The Alchemist", "Paulo Coelho"));
		library.addBook(new Book(103, "Rich Dad Poor Dad", "Robert Kiyosaki"));
		
		// Preloaded Users
		
		library.addusers(new User(1, " Amit"));
		library.addusers(new User(2, "Sneha"));
		
		int choice;
		do {
			System.out.println("\n==== Library Menu ====");
			System.out.println("1. Show All Books");
			System.out.println("2. Show All Users");
			System.out.println("3. Issue Book");
			System.out.println("4. Return Book");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				      library.showAllBooks();
			          break;
			case 2:
				      library.showAllUsers();
				      break;
			case 3: 
			        System.out.println("Enter book Id to Issue: ");
			        int issuedBookId = sc.nextInt();
			        System.out.println("Enter User ID: ");
			        int issuedUserId = sc.nextInt();
			        library.issueBook(issuedBookId, issuedUserId);
			        break;
			case 4:
				
				   System.out.println("Enter Book ID to Return: ");
				   int returnBookId=sc.nextInt();
				   System.out.println("Enter User ID: ");
				   int returnUserId = sc.nextInt();
				   library.returnBook(returnBookId, returnUserId);
				   break;
				   
			case 5: 
				    System.out.println("Exiting Library System. Goodbye!");
				    break;
				    
		    default:  
		    	     System.out.println("Invalid choice! Try again.");
		    
			}
		} while(choice != 5);
		sc.close();	
	}
  }
