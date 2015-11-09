public interface LibraryUser {
	
	int getLibraryId();
	
	String getName();
	
	Library getLibrary();
	
	void register(Library library);
}