import java.util.Scanner;

public class ExercicioMediaNumeros {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Digite 10 números seguidos:");

		numeros[0] = in.nextInt();
		numeros[1] = in.nextInt();
		numeros[2] = in.nextInt();
		numeros[3] = in.nextInt();
		numeros[4] = in.nextInt();
		numeros[5] = in.nextInt();
		numeros[6] = in.nextInt();
		numeros[7] = in.nextInt();
		numeros[8] = in.nextInt();
		numeros[9] = in.nextInt();

		double media = (numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4] + numeros[5] + numeros[6]
				+ numeros[7] + numeros[8] + numeros[9]) / 10;

		System.out.print(" A média entre os números: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ","
				+ numeros[3] + ", " + numeros[4] + ", " + numeros[5] + ", " + numeros[6] + ", " + numeros[7] + ","
				+ numeros[8] + " e " + numeros[9] + " é: " + media);

	}

}
