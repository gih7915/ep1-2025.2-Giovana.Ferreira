package Menus;
import java.util.Scanner;

public class Menu_Principal 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Mensagem de Boas-vindas ao usuário
        System.out.println("Bem-vindo ao Grey Sloan Memorial Hospital");

        System.out.println("Nos informe se você é:");

        System.out.println("1 - Paciente");
        System.out.println("2 - Médico");
        System.out.println("3 - Administrador");
        System.out.print("Digite o número da sua opção: ");

        int Opcao_do_Usuario = scanner.nextInt();

        switch (Opcao_do_Usuario) {
            case 1:
                System.out.println("Você Selecionou o Menu Paciente");
                System.out.println("Como podemos te ajudar?");
                System.out.println("1 - Marcar consulta");
                System.out.println("2 - Ver Agendamentos");
                System.out.println("3 - Consultar Exames");
                System.out.print("Digite sua opção: ");
                int opcaoPaciente = scanner.nextInt();
                System.out.println("Você escolheu a opção: " + opcaoPaciente);
                break;

            case 2:
                System.out.println("Você Selecionou o Menu Médico");
                System.out.println("Como podemos te ajudar?");
                System.out.println("1 - Visualizar Histórico do Paciente");
                System.out.println("2 - Registrar a Consulta");
                System.out.print("Digite sua opção: ");
                int opcaoMedico = scanner.nextInt();
                System.out.println("Você escolheu a opção: " + opcaoMedico);       
                break;   

            case 3:
                System.out.println("Você Selecionou o Menu Administrador");
                System.out.println("Como podemos te ajudar?");
                System.out.println("1 - Cadastrar Pacientes");
                System.out.println("2 - Cadastrar Médicos");      
                System.out.println("3 - Realizar Internação");
                System.out.print("Digite sua opção: ");
                int opcaoAdmin = scanner.nextInt();
                System.out.println("Você escolheu a opção: " + opcaoAdmin);                 
                break;     
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }

        scanner.close();
        // A partir daqui, você poderia adicionar a lógica para cada caso (paciente, médico, etc.)
    }
    
}