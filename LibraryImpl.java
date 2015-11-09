public class LibraryImpl implements Library {

	private final String name;
	
	public LibraryImpl(String name) {
		
		this.name = name;
	}

	public String getName() {
		
		return name;
	}
	
	public int getMaxBooksPerUser() {
		return -99;
	}
	
	public void setMaxBooksPerUser(int maxBooksPerUser) {
		
	}
}