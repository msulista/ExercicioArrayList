public class Exec11 {
	public static void main(String[] args) {
		int varAuxNum = 0;
		String binario = "";

		while (varAuxNum >= 1) {
			binario = (varAuxNum % 2) + binario;
			varAuxNum = varAuxNum / 2;
		}
		System.out.println(binario);

	}
}
