public class LibraryUserImpl implements LibraryUser {

	private final String name;
	private int libraryId;
	private Library library;
	
	public LibraryUserImpl(String name) {
		
		this(name, 0);		
	}
	
	public LibraryUserImpl(String name, int libraryId) {
		
		this.name = name;
		this.libraryId = libraryId;
		library = null;
	}
	
	public int getLibraryId(){
	
		return libraryId;
	}
	
	public String getName(){
	
		return name;
	}
	
	public Library getLibrary(){
	
		return library;
	}
	
	public void register(Library library) {
		
		this.library = library;
	}
}