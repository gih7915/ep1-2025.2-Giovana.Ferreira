

public class Medicos
{
    //Atributos (Características dos Médicos)
    private String Nome;
    private String Especialidade; //Utilizando encapsulamento para proteger os dados
    private int CRM;
    private int Sala;
    private float Custo_da_consulta;
    private String Agenda_de_Horario;

    //Construtor
    public Medicos(String Nome, String Especialidade, int CRM, int Sala, float Custo_da_consulta, String Agenda_de_Horario)
    {
        this.Nome = Nome;
        this.Especialidade = Especialidade;
        this.CRM = CRM;
        this.Sala = Sala;
        this.Custo_da_consulta = Custo_da_consulta;
        this.Agenda_de_Horario = Agenda_de_Horario;
    }
}