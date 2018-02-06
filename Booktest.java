
public class Booktest {
public static void main (String []args){
	Books one=new Books("Thomas Jones",1974,1567375,34.00);
	System.out.println(one.BookAuthor);
	System.out.println(one.BookYearPublished);
	System.out.println(one.ISBNNumber);
	System.out.println(one.Price);
	
	Books two= new Books("Thompson Fedrnine",1889,4387234,47.00);
	System.out.println(two.BookAuthor);
	System.out.println(two.BookYearPublished);
	System.out.println(two.ISBNNumber);
	System.out.println(two.Price);
}
}
