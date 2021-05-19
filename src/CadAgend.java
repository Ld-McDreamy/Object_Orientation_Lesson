// Andressa Aoki de Araújo - RA: 74.140
// Vinícius Rodrigues de Carvalho - RA 74.381

import javax.swing.JOptionPane;

public class CadAgend {

	public static void main(String[] args) {
		
		int numMed = Integer.parseInt(JOptionPane.showInputDialog("Quantos Médicos deseja cadastrar?"));
	
		Medico[] listaMedico = new Medico[numMed];
		
		
		for (int i = 0; i < numMed; i++)
		{
			if (listaMedico[i] == null)
			{
				listaMedico[i] = new Medico();
			}
		}
		
		int opcao;
		String nome;
		int CRM;
		int matricula;
		for (int i = 0; i < numMed; i++)
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer o cadastro de médicos simplificado? (1-sim, 2-não): "));
			
			if (opcao == 1)
			{
				nome = JOptionPane.showInputDialog("Informe o primeiro nome do " + (i+1) +"º médico: ");
				listaMedico[i].setMedico(nome);
			}
			else if (opcao ==2)
			{
				nome = JOptionPane.showInputDialog("Informe o primeiro nome do " + (i+1) +"º médico: ");
				CRM = Integer.parseInt(JOptionPane.showInputDialog("Informe o CRM do " + (i+1) + "º médico: "));
				matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do " + (i+1) + "º médico: "));
				listaMedico[i].setMedico(nome, CRM, matricula);
			}
		}
		
		char SN = 's';
		String especialidade;
		String SNstring;
		int dia;
		int mes;
		int numAg = 0;
		int numEscMed;
		Medico medico = new Medico();
		Agendamento[] listaAgendamentos = new Agendamento[100];
		
		while (SN == 's' || SN == 'S')
		{
			JOptionPane.showMessageDialog(null,"Escolha um médico: " ,"REALIZAÇÃO DE AGENDAMENTOS", JOptionPane.INFORMATION_MESSAGE);
			for (int i = 0; i < numMed; i++)
			{
				JOptionPane.showMessageDialog(null,"Digite " + i + " para Médico(a): " + listaMedico[i].getNome(),"REALIZAÇÃO DE AGENDAMENTOS", JOptionPane.INFORMATION_MESSAGE);
			}
			
			numEscMed = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do médico(a): "));
			listaAgendamentos[numAg] = new Agendamento();
			especialidade = JOptionPane.showInputDialog("• Digite a especialidade: ");
			dia = Integer.parseInt(JOptionPane.showInputDialog("• Digite o dia: "));
			mes = Integer.parseInt(JOptionPane.showInputDialog("• Digite o mês: "));
			SNstring = JOptionPane.showInputDialog("• Deseja realizar outro agendamento? ");
			SN = SNstring.charAt(0);
			medico = listaMedico[numEscMed];
			listaAgendamentos[numAg].setAgendamento(medico, especialidade, dia, mes);
			numAg++;
		}
		
		
		
		for (int i = 0; i < numAg; i++)
		{
			listaAgendamentos[i].relatorio();
		}
	}

}
