class Agendamento {
    ListaDinamica listaDinamica = new ListaDinamica();
    ListaEstatica listaEstatica = new ListaEstatica(3);

    void printAgendamentoMedico() {
        listaEstatica.print();
    }

    void printAgendamentoEnfermagem() {
        listaDinamica.print();
    }

    void agendamentoMedico(String nomePaciente) {
        listaEstatica.enqueue(nomePaciente);
    }

    void agendamentoEnfermagem(String nomePaciente) {
        listaDinamica.enqueue(nomePaciente);
    }


}