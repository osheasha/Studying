public class Assignment1_5 {
	public static String run(int N) {
		//initially square would be empty
		String square = "";
		//start from the first row until Nth row
		for(int row = 1; row <= N; row = row + 1)	{
			//start from the 1st column until the Nth column
			for(int column = 1; column <= N; column = column +1) {
				 square = square + "*";
			}
			//start a new line
			square = square + "\n";
		}
		return square;
	}
}