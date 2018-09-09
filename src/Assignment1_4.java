public class Assignment1_4{
	//num1 is the first number, num2 is the second, num3 is the third
	public static int run(int num1, int num2, int num3) {
		//checking whether numbers are distinct
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			return -1;
		}
		//check the greatest number and output which number is the largest
		if ((num1 > num2) && (num1 > num3)) {
			return 1;
		}
		else if (num2 > num1 && num2 > num3) {
			return 2;
		}
		return 3;
	}
}
