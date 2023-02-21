package ms.lambda.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TavantLambdaQ {

	public static void main(String[] args) {
		List<Author> authorList = new ArrayList<>();
		List<Book> booksList = new ArrayList<Book>();

		Author auth1 = new Author("Mahesh", "male", 38);
		Author auth2 = new Author("Krishna", "male", 8);
		Author auth3 = new Author("Govind", "male", 10);

		Book book1 = new Book(auth1, "Title-1", 20);
		Book book2 = new Book(auth2, "Title-2", 40);
		Book book3 = new Book(auth3, "Title-3", 30);

		authorList.add(auth1);
		authorList.add(auth2);
		authorList.add(auth3);
		booksList.add(book1);
		booksList.add(book2);
		booksList.add(book3);

		List<Author> authors = authorList.stream()
				.filter(auth -> (auth.getAge() > 8))
				.collect(Collectors.toList());
		System.out.println("List of authors " + authors);
		
		booksList.stream().forEach(System.out :: println);

		Set<Book> filteredListOfAuthors = 
				authorList.stream()
						.flatMap(booksStream -> (booksList.stream()))
						.filter(books -> (books.getAuthor().getAge() > 8))
						.collect(Collectors.toSet());
		
		System.out.println("Filtered Books "+filteredListOfAuthors);
		String st = "abcdefg";
		
		List<Book> newListOfBooks = new ArrayList<Book>();
		
		for (Iterator<Book> bookIterator = booksList.iterator(); bookIterator.hasNext();) {
			Book book = bookIterator.next();
			Author bookAuther = book.getAuthor();
			for (Iterator<Author> iterator = authors.iterator(); iterator.hasNext();) {
				Author au = iterator.next();
				if (au.equals(bookAuther)) {
					newListOfBooks.add(book);
				}
			}
		}
		
		System.out.println("List of Books whose authors age is more then 8 \n\t " + newListOfBooks);

	}

}

class Author {
	private String name;
	private String gender;
	private int age;

	@Override
	public String toString() {
		return "Author [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	public Author(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Book {
	private Author author;
	private String title;
	private int price;

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", price=" + price + "]";
	}

	public Book(Author author, String title, int price) {
		super();
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}