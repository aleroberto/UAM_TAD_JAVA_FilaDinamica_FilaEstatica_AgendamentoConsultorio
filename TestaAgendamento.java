class TestaAgendamento {

    public static void main(String [] args) {
        Agendamento agendar = new Agendamento();

        agendar.agendamentoMedico("Kleber");
        agendar.agendamentoMedico("Wesley");
        agendar.agendamentoMedico("Rafael");
        agendar.agendamentoMedico("Jeferson");

 System.out.println("");
        agendar.agendamentoEnfermagem("Rogers");
        agendar.agendamentoEnfermagem("Jeferson");
        agendar.agendamentoEnfermagem("Kleber");
        agendar.agendamentoEnfermagem("Rafael");
        agendar.agendamentoEnfermagem("Rogers");
        agendar.agendamentoEnfermagem("Rafael");
 System.out.println("");
        System.out.println("Agendamento medico:");
        agendar.printAgendamentoMedico();
 System.out.println("");
        System.out.println("Agendamento Enfermagem:");
        agendar.printAgendamentoEnfermagem();

    }

}


