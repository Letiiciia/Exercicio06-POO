import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private double altura;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public int getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int idade() {
		
		LocalDate data = LocalDate.now();
		int year = data.getYear();
		int idade = year - this.getAnoNascimento();
		
		return idade;
	}
	
	public String dados() {
		return "Dados" 
			 + "\n" + "nome: " + this.getNome()
			 + "\n" + "data de nascimento: " + this.getDiaNascimento() +"/"+this.getMesNascimento()+"/"+this.getAnoNascimento()
			 + "\n" + "idade: " + idade()
			 + "\n" + "altura: " + this.getAltura();
	}
	
	
}
