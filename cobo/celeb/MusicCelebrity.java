// FIRE: Fang Chen, Courtney Huang, Brianna Tieu
// apcs pd06
// L09 -- Celeb
// 2022-04-27
// time spent: 2.0 hrs

import java.util.ArrayList;

/**
 * Subclass of Celebrity to show how methods can be overridden and super can be called while changing functionality.
 * @author cody.henrichsen
 * @version 1.0 15/09/2018
 */
public class MusicCelebrity extends Celebrity
{
	/**
	 * The list of clues for the Music Celebrity. They can be titles of texts, important characters, settings, etc...s
	 */
	private ArrayList<String> clueList;

	/**
	 * Builds a MusicCelebrity instance with an answer and a series of clues as a String separated by commas.
	 * @param answer The Music celebrity
	 * @param clues Clues for the Music celebrity
	 */
	public MusicCelebrity(String answer, String clues)
	{
		super(answer, clues);
		processClues();
	}

	/**
	 * Processes the series of clues for the MusicCelebrity by adding all the values to an ArrayList<String> by
	 * splitting the original clue to an array of String.
	 * The original value is not impacted, thus preserving data and inheritance integrity.
	 */
	private void processClues()
	{
		String [] clues = super.getClue().split(",");
		clueList = new ArrayList<String>();
		for (String currentClue : clues)
		{
			clueList.add(currentClue);
		}
	}

	/**
	 * Overridden version of the getClue() method that cycles through each of the individual clues in the series.
	 * It recreates the clueList if the user has finished the series of clues.
	 */
	@Override
	public String getClue()
	{
		if (clueList.size() == 0)
		{
			processClues();
		}
		String currentClue = clueList.remove(0);

		return currentClue;
	}


	@Override
	public String toString()
	{
		String dsc = "This is the music celebrity: " + getAnswer() + "\nThe clues are:\n";

		for (String word : super.getClue().split(","))
		{
			dsc += word + "\n";
		}

		return dsc;
	}

}