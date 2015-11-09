import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;
import java.lang.*;


public class LibraryImplTest {

	private Library instance;
	
//	@Before
	public void init() {

	}
	
	@Test
	public void getNameNotSetTest() {
		
		instance = new LibraryImpl(null);
		String resultName = instance.getName();
		assertNull(resultName);
	}
	
	@Test
	public void getNameSetTest() {
		
		String expectedName = "expectedName";
		instance = new LibraryImpl(expectedName);
		String resultName = instance.getName();
		assertEquals(expectedName,resultName);
	}
	
	@Test
	public void getMaxBooksPerUserTest() {
		
		int expectedMaxBooksPerUser = 0;
		instance = new LibraryImpl(null);
		int resultMaxBooksPerUser = instance.getMaxBooksPerUser();
		assertEquals(expectedMaxBooksPerUser, resultMaxBooksPerUser);
	}
	
	@Test
	public void setMaxBooksPerUserTest() {
		
		int expectedMaxBooksPerUser = 3;
		instance = new LibraryImpl(null);
		instance.setMaxBooksPerUser(expectedMaxBooksPerUser);
	}
	
}