import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



 // Método para ter médicos salvos desde o início
    private void carregarMedicosIniciais() 
    {
        // Criando e adicionando médicos à lista
        listaDeMedicos.add(new Medico("Alex Karev", "Pediatria", "CRM-DF 12345", 01, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Arizona Robbins", "Pediatria", "CRM-DF 64664", 01, 150.00, "Segunda a Sábado - 14h-20h" ));
        listaDeMedicos.add(new Medico("Addison Montgomery", "Ginecologia", "CRM-DF 12345", 02, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Carina Deluca", "Ginecologia", "CRM-DF 12345", 02, 150.00, "Segunda a Sábado - 14h-20h" ));
        listaDeMedicos.add(new Medico("Cristina Yang", "Cardiologia", "CRM-DF 12345", 03, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Maggie Pierce", "Cardiologia", "CRM-DF 12345", 03, 150.00, "Segunda a Sábado - 14h-20h" ));
        listaDeMedicos.add(new Medico("Derek Shepard", "Neurologia", "CRM-DF 12345", 04, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Amelia Shepard", "Neurologia", "CRM-DF 12345", 04, 150.00, "Segunda a Sábado - 14h-20h" ));
        listaDeMedicos.add(new Medico("Dianna Cristina", "Dermatologia", "CRM-DF 12345", 05, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Lara Croft", "Dermatologia", "CRM-DF 12345", 05, 150.00, "Segunda a Sábado - 14h-20h" ));
        listaDeMedicos.add(new Medico("Arthur Morgan", "Psiquiatria", "CRM-DF 12345", 06, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Leon Kennedy", "Psiquiatria", "CRM-DF 12345", 06, 150.00, "Segunda a Sábado - 14h-20h" ));
        listaDeMedicos.add(new Medico("Callie Torres", "Ortopedia", "CRM-DF 12345", 07, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Atticus Lincoln", "Ortopedia", "CRM-DF 12345", 07, 150.00, "Segunda a Sábado - 14h-20h" ));
        listaDeMedicos.add(new Medico("Claire Redfield", "Oftalmologia", "CRM-DF 12345", 08, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Moira Burton", "Oftalmologia", "CRM-DF 12345", 08, 150.00, "Segunda a Sábado - 14h-20h" ));
        listaDeMedicos.add(new Medico("Mark Sloan", "Otorrinolaringologia", "CRM-DF 12345", 09, 150.00, "Segunda a Sábado - 06h-12h" ));
        listaDeMedicos.add(new Medico("Max Caulfield", "Otorrinolaringologia", "CRM-DF 12345", 09, 150.00, "Segunda a Sábado - 14h-20h" ));
        
    }