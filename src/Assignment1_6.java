
public class Assignment1_6 {
	public static String run(int N) {
		String square = "";
		for(int row = 1; row <= N; row = row +1) {
			for(int column = 1; column <= row; column = column + 1) {
				square = square + "*";
			}
			square = square + "\n";
		}
		return square;
	}
}