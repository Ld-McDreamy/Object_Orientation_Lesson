import javax.swing.JOptionPane;

public class Medico {
	//nome, CRMe matricula.
	private String nome;
	private int CRM;
	private int matricula;
	
	public void setMedico(String nome, int CRM, int matricula)
	{
		setNome(nome);
		setCRM(CRM);
		setMatricula(matricula);
	}
	
	public void setMedico(String nome)
	{
		setNome(nome);
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setCRM(int CRM)
	{
		this.CRM = CRM ;
	}
	
	public int getCRM()
	{
		return this.CRM;
	}
	
	public void setMatricula(int matricula)
	{
		this.matricula = matricula;
	}
	
	public int getMatricula()
	{
		return this.matricula;
	}

}
