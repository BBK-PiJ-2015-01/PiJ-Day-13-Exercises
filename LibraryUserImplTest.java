import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;
import java.lang.*;


public class LibraryUserImplTest {

	private LibraryUser instance;
	private final String ALWAYS_INVALID_STRING = "ALWAYS_INVALID_STRING";
	private final int ALWAYS_INVALID_INT = -99;
	
//	@Before
	public void init() {

	}
		@Test
	public void getNameTest_OneConstructorArg() {
	
		String expectedName = "Simon";
		instance = new LibraryUserImpl(expectedName);
		String resultName = instance.getName();
		assertNotNull(resultName);
		assertEquals(expectedName, resultName);
	}
	
	@Test
	public void getNullNameTest_OneConstructorArg() {
	
		instance = new LibraryUserImpl(null);
		String resultName = instance.getName();
		assertNull(resultName);
	}
	
	@Test
	public void getEmptyNameTest_OneConstructorArg() {
	
		String expectedName = "";
		instance = new LibraryUserImpl(expectedName);
		String resultName = instance.getName();
		assertNotNull(resultName);
		assertEquals(expectedName, resultName);
	}
	@Test
	public void getNameTest_TwoConstructorArgs() {
	
		String expectedName = "Simon";
		instance = new LibraryUserImpl(expectedName, 0);
		String resultName = instance.getName();
		assertNotNull(resultName);
		assertEquals(expectedName, resultName);
	}
	
	@Test
	public void getNullNameTest_TwoConstructorArgs() {
	
		instance = new LibraryUserImpl(null, 0);
		String resultName = instance.getName();
		assertNull(resultName);
	}
	
	@Test
	public void getEmptyNameTest_TwoConstructorArgs() {
	
		String expectedName = "";
		instance = new LibraryUserImpl(expectedName, 0);
		String resultName = instance.getName();
		assertNotNull(resultName);
		assertEquals(expectedName, resultName);
	}
	
	@Test
	public void getLibraryIdTest() {
	
		int expectedLibraryId = -99;
		instance = new LibraryUserImpl(null, expectedLibraryId);
		int resultLibraryId = instance.getLibraryId();
		assertNotNull(resultLibraryId);
		assertEquals(expectedLibraryId, resultLibraryId);
	}
	
	@Test
	public void getNullLibraryIdTest() {
	
		int expectedLibraryId = 0;
		instance = new LibraryUserImpl(null);
		int resultLibraryId = instance.getLibraryId();
		assertNotNull(resultLibraryId);
		assertEquals(expectedLibraryId, resultLibraryId);
	}
	
	@Test
	public void getLibraryNotSetTest() {
	
		instance = new LibraryUserImpl("Username");
		Library resultLibrary = instance.getLibrary();
		assertNull(resultLibrary);
	}
	
	@Test
	public void getLibraryAfterSetTest() {
	
		instance = new LibraryUserImpl("Username");
		Library expectedLibrary = getMockLibrary();
		instance.register(expectedLibrary);
		Library resultLibrary = instance.getLibrary();
		assertEquals(expectedLibrary, resultLibrary);
	}
		
	@Test
	public void registerUserWithLibraryTest() {
	
		Library expectedLibrary = getMockLibrary();
		instance = new LibraryUserImpl("Username");
		instance.register(expectedLibrary);;
	}
	
	
	//
	//
	//
	private Library getMockLibrary() {
		
		return new Library(){
			
			public String getName() {
				return ALWAYS_INVALID_STRING;
			}
			
			public int getMaxBooksPerUser() {
				return ALWAYS_INVALID_INT;
			}
			
			public void setMaxBooksPerUser(int maxBooksPerUser) {
				
			}
		};
	}
}