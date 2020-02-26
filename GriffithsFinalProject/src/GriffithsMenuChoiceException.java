/**
 * 12/2/2019
 * @author Mark Griffiths
 * Class: CSC151
 * Purpose: Custom exception to throw with menuChoice 3 on main game selection
 *
 */
public class GriffithsMenuChoiceException extends Exception {
	
	public GriffithsMenuChoiceException() {
		super("Yeah, I told you not to pick that one, and what did you do?");
	}
	
	public GriffithsMenuChoiceException(int menuChoice) {
		super("Yeah, I told you not to pick that one, and what did you do?");
	}

}
