package hugosandell.bibliotech;

import java.util.Date;
import java.util.Locale;

public class Author {
	// The typically used name for the author, including initials. 
	// e.g. "Charles Dickens", "J.R.R. Tolkien"
	protected String full_name;	
	protected String first_name;
	protected String last_name;
	
	protected String biography;
	
	protected Locale country;
	protected Date date_of_birth;
	
	public Author(String name) {
		this.full_name = name;
	}
}
