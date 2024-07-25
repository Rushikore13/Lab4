package A;
class Item
{
	String title;
	String publisher;
	int publicationYear;
	
	public Item(String title,String publisher,int publicationYear)
	{
		this.title=title;
		this.publisher=publisher;
		this.publicationYear=publicationYear;
		
	}
	public void displayInfo() {
		System.out.println("The "+title+"Published by "+publisher+" in year"+publicationYear);
	}

}
class Book extends Item
{
	String author;
	int numOfPages;

	public Book( String author,String title,String publisher,int numOfPages,int publicationYear) {
		super(title,publisher,publicationYear);
		this.author=author;
		this.numOfPages=numOfPages;
		
	}
	public void displayInfo() {
        super.displayInfo();
        System.out.println("The "+title+" written by "+author+"Published by "+publisher+"with "+numOfPages+"Pages In year "+publicationYear);
	}
}
public class Library {

	public static void main(String[] args) {
		Book b1=new Book("Ram","The last Drive","san Publication",200,2014);
		b1.displayInfo();
	

	}

}
