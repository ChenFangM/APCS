// FIRE: Fang Chen, Courtney Huang, Brianna Tieu
// apcs pd06
// L09 -- Celeb
// 2022-04-27
// time spent: 2.0 hrs

/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		Celebrity bruno = new Celebrity("bruno", "singer");
		System.out.println(bruno.getClue());
		System.out.println(bruno.getAnswer());

		Celebrity john = new Celebrity("john green", "book");

		CelebrityGame game1 = new CelebrityGame();
		game1.addCelebrity("bruno", "singer", "Music");
		game1.addCelebrity("john green", "book", "Literature");

		game1.prepareGame();
		game1.play();
	}
}