package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
	
	private List<Musica> musicas;
    private String dono;

    public Playlist(String dono) {
    	dono = null;
        musicas = new ArrayList<>();
    }
    
    public String getDono() {
		return dono;
		
	}
	
	public void setDono (String dono) {
		this.dono = dono;
		
	}
	
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void tocarMusicaAleatoria() {
        if (musicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
            return;
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(musicas.size());
        Musica musicaAleatoria = musicas.get(indiceAleatorio);
        System.out.println("Tocando a música: " + musicaAleatoria.getNome());
    }
}