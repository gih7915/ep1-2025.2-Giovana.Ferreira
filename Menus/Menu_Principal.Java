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

        // (Opcional) Mostra a opção que o usuário escolheu
        System.out.println("Você escolheu a opção: " + Opcao_do_Usuario);    
        scanner.close();    

        // A partir daqui, você poderia adicionar a lógica para cada caso (paciente, médico, etc.)
    }
    
}