import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		int diaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite do seu aniversário: "));
		int mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu aniversário"));
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu aniversário"));
		
				
		pessoa1.setNome(nome);
		pessoa1.setAltura(altura);
		pessoa1.setDiaNascimento(diaNascimento);
		pessoa1.setMesNascimento(mesNascimento);
		pessoa1.setAnoNascimento(anoNascimento);
		
		JOptionPane.showMessageDialog(null, pessoa1.dados());		
		
	}
}
