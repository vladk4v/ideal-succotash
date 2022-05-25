public class BinOps {

	public String sum(String a, String b) {

		/*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/

		int i = Integer.parseInt(a, 2);
		int j = Integer.parseInt(b, 2);

		int summarize = i + j;
		return Integer.toBinaryString(summarize);
	}

	public String mult(String a, String b) {

		/*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/

		int i = Integer.parseInt(a, 2);
		int j = Integer.parseInt(b, 2);

		int multiplication = i * j;
		return Integer.toBinaryString(multiplication);
	}
}

