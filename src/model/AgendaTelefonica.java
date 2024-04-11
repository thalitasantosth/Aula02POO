package model;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
	private List<Contato> contatos;
	
	// Construtor
    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    // Método para adicionar um contato à agenda
    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    // Método para remover um contato da agenda
    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    // Método para buscar um contato pelo nome
    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se o contato não for encontrado
    }
}
