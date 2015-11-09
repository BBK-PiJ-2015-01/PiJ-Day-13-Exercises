import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;
import java.lang.*;

/**
*	Simple class to hold book title and author name
*	@author	Simon
*/
public class BookImplTest {

	private Book instance;
	
//	@Before
	public void init() {

	}
	
	@Test
	public void getTitleTest() {
	
		String expectedTitle = "Beginners Guide to Java";
		instance = new BookImpl(expectedTitle, null);
		String resultTitle = instance.getTitle();
		assertNotNull(resultTitle);
		assertEquals(expectedTitle, resultTitle);
	}
	
	@Test
	public void getNullTitleTest() {
	
		String expectedTitle = "Beginners Guide to Java";
		instance = new BookImpl(null, null);
		String resultTitle = instance.getTitle();
		assertNull(resultTitle);
	}
	
	@Test
	public void getEmptyTitleTest() {
	
		String expectedTitle = "";
		instance = new BookImpl(expectedTitle, null);
		String resultTitle = instance.getTitle();
		assertNotNull(resultTitle);
		assertEquals(expectedTitle, resultTitle);
	}
	
	@Test
	public void getAuthorNameTest() {
	
		String expectedAuthorName = "Joshua Bloch";
		instance = new BookImpl(null, expectedAuthorName);
		String resultAuthorName = instance.getAuthorName();
		assertNotNull(resultAuthorName);
		assertEquals(expectedAuthorName, resultAuthorName);
	}
	
	@Test
	public void getNullAuthorNameTest() {
	
		instance = new BookImpl(null, null);
		String resultAuthorName = instance.getAuthorName();
		assertNull(resultAuthorName);
	}
	
	@Test
	public void getEmptyAuthorNameTest() {
	
		String expectedAuthorName = "";
		instance = new BookImpl(null, expectedAuthorName);
		String resultAuthorName = instance.getAuthorName();
		assertNotNull(resultAuthorName);
		assertEquals(expectedAuthorName, resultAuthorName);
	}		
	
	
}