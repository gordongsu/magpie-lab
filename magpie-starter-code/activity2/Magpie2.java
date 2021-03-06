/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hey, let's start a conversation.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";

		if (statement.indexOf("no") >= 0 || statement.indexOf("No") >= 0) {
			response = "Why not?";
		} else if (statement.indexOf("Elliot") >= 0 || statement.indexOf("elliot") >= 0) {
			response = "Yes, Elliot is great.";
		} else if (statement.indexOf("Jason") >= 0 || statement.indexOf("jason") >= 0) {
			response = "Jason should be doing his homework.";
		} else if (statement.indexOf("Sun") >= 0 || statement.indexOf("sun") >= 0) {
			response = "The sun is very hot.";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
	    	response = "Tell me more about your pets.";
	    } else if (statement.indexOf("Dr. Petach") >= 0) {
	    	response = "She sounds like a good teacher.";
	    } else if (statement.trim().length() == 0) {
	    	response = "Say something, please.";
	    } else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting!";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmmmmmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Nice.";
		}
		else if (whichResponse == 3)
		{
			response = "I like bread.";
		}
		else if (whichResponse == 4)
		{
			 response = "Your feet are smelly.";
		}
		else if (whichResponse == 5)
		{
			response = "Really?";
		}
		return response;
	}
}
