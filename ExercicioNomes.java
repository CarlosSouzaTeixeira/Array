import javax.swing.JOptionPane;

public class ExercicioNomes {

public static void main(String[] args) {
		
		String[] nomes = new String[10];
		
		for( int x=0; x<nomes.length; x++) {
			nomes [x] = JOptionPane.showInputDialog("Digite o "+(x+1)+"° nome: ");
			
		}
		System.out.println("Lista de nomes digitados:");
		for (String nome: nomes)
			System.out.println(nome);
	}

}
