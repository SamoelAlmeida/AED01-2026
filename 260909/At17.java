import java.util.Scanner;//Compromisso de agenda

class Hora {
    int hora;
    int minuto;
    int segundo;
}

class Data {
    int dia;
    int mes;
    int ano;
}

class Compromisso {
    String compromisso;
    Hora horario;
    Data data;
}

public class At17 {
    public static Scanner entrada = new Scanner(System.in);
    
    public static void exibirCompromisso(Compromisso c) {
        System.out.println("Compromisso: " + c.compromisso);
        System.out.printf("Data: %02d/%02d/%d\n", c.data.dia, c.data.mes, c.data.ano);
        System.out.printf("Horário: %02d:%02d:%02d\n", c.horario.hora, c.horario.minuto, c.horario.segundo);
    }

    public static void main(String[] args) {
        Compromisso agenda = new Compromisso();
        agenda.compromisso = "Reunião de Projeto";
        
        agenda.data = new Data();
        agenda.data.dia = 10;
        agenda.data.mes = 6;
        agenda.data.ano = 2026;

        agenda.horario = new Hora();
        agenda.horario.hora = 14;
        agenda.horario.minuto = 30;
        agenda.horario.segundo = 0;

        exibirCompromisso(agenda);
    }
}