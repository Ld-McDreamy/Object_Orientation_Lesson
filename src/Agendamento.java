import javax.swing.JOptionPane;

public class Agendamento {
	//medico(do tipo Medico), especialidade, diaemês.
	//relatorio() 
	
	private Medico medico;
	private String especialidade;
	private int dia;
	private int mes;
	
	public void setAgendamento(Medico medico, String especialidade, int dia, int mes)
	{
		this.setEspecialidade(especialidade);
		this.setDia(dia);
		this.setMes(mes);
		this.setMedico(medico);
	}
	
	
	public void relatorio()
	{
		JOptionPane.showMessageDialog(null, "• Médico: " + this.medico.getNome() + " - CRM: " + this.medico.getCRM() + "\n• Especialidade: " + this.getEspecialidade() + "\n• Data da consulta: " + this.getDia() + "/" + this.getMes() + "/2021", "RELATÓRIO DA CONSULTA", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void setEspecialidade(String especialidade )
	{
		this.especialidade = especialidade;
	}
	
	public void setMedico(Medico medico )
	{
		if (this.medico == null)
		{
			this.medico = new Medico();
		}
		this.medico = medico;
	}
	
	public String getEspecialidade()
	{
		return this.especialidade;
	}
	
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	
	public int getDia()
	{
		return this.dia;
	}
	
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	
	public int getMes()
	{
		return this.mes;
	}
	
	public void setMes(Medico medico)
	{
		this.medico = medico;
	}
	
	public Medico getMedico()
	{
		return this.medico;
	}

}
