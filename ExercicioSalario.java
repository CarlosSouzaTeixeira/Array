import java.util.Scanner;

public class ExercicioSalario {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		double[] salario = new double[10];

		System.out.println("Digite 10 valores de salário seguidos:");

		salario[0] = in.nextDouble();
		salario[1] = in.nextDouble();
		salario[2] = in.nextDouble();
		salario[3] = in.nextDouble();
		salario[4] = in.nextDouble();
		salario[5] = in.nextDouble();
		salario[6] = in.nextDouble();
		salario[7] = in.nextDouble();
		salario[8] = in.nextDouble();
		salario[9] = in.nextDouble();

		int maior = 0;
		for (int x = 1; x < 10; x++) {

			if (salario[x] > salario[maior]) {
				maior = x;
			}
		}
		System.out.println(" O indice de maior salario é o de número " + maior);
	}
}
