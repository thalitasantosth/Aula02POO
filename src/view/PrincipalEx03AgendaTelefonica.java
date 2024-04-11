package view;

import model.AgendaTelefonica;
import model.Contato;

public class PrincipalEx03AgendaTelefonica {

	public static void main(String[] args) {
		// Criando uma agenda telefônica
        AgendaTelefonica agenda = new AgendaTelefonica();

        // Adicionando contatos à agenda
        Contato contato1 = new Contato("Fulano", "123456789", "fulano@example.com");
        Contato contato2 = new Contato("Ciclano", "987654321", "ciclano@example.com");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        // Buscando um contato pelo nome
        Contato resultadoBusca = agenda.buscarContato("Fulano");
        if (resultadoBusca != null) {
            System.out.println("Contato encontrado: " + resultadoBusca.getNome() + ", Telefone: " + resultadoBusca.getTelefone() + ", Email: " + resultadoBusca.getEmail());
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Removendo um contato da agenda
        agenda.removerContato(contato1);
    }
}

