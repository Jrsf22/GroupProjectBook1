import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class BookCollectionTest {
	private BookCollection bc;
	private Book b1;
	private Book b2;
	private Book b3;
	private Book b4;
	private final int BOOK_COLLECTION_SIZE = 4;
	private final int BOOK_CAPACITY_LIMIT = 20;

	@BeforeEach
	void setUp() throws Exception {
		bc = new BookCollection();
		b1 = new Book("Harry", "good 4 u", "Olivia Rodrigo", 3);
		b2 = new Book("Potter", "Peaches", "Justin Biber", 3);
		b3 = new Book("Sun", "MONTERO", "Lil Nas X", 2);
		b4 = new Book("Bookss", "bad guy", "Billie Eilish", 3);
		bc.addBook(b1);
		bc.addBook(b2);
		bc.addBook(b3);
		bc.addBook(b4);
	}
		@AfterEach
		void tearDown() throws Exception {
		}
	@Test
	void testGetBooks() {
		//fail("Not yet implemented");
		// Act
				List<Book> testSc = bc.getBooks();

				// Assert
				// Assert that Song Collection is not empty after invoking getSongs function
				// assertTrue(!testSc.isEmpty());
				assertFalse(testSc.isEmpty());

				// Assert that Song Collection size contains the correct amount of songs inside
				assertEquals(testSc.size(), BOOK_COLLECTION_SIZE);
	}

	@Test
	void testAddBook() {
		// fail("Not yet implemented");
				List<Book> testSc = bc.getBooks();
				
				// Assert that Song Collection is equals to song collection size 4
				assertEquals(testSc.size(), BOOK_COLLECTION_SIZE);
				
				// Act
				bc.addBook(b1);
				
				// Assert that Song Collection is equals to song collection size 4 + 1
				assertEquals(bc.getBooks().size(), BOOK_COLLECTION_SIZE + 1);

				//Act attempt to add 17 songs to current 4 songs
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				bc.addBook(b1);
				
				// Assert that Song Collection cannot be more than 20 (capacity)
				assertEquals(bc.getBooks().size(), BOOK_CAPACITY_LIMIT);
	}

}
