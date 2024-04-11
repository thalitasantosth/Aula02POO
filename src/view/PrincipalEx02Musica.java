package view;

import model.Musica;
import model.Playlist;

public class PrincipalEx02Musica {

	public static void main(String[] args) {
		//Músicas
		Musica m1 = new Musica();
		m1.setNome("Shape of You");
		m1.setAutor("Ed Sheeran");
		m1.setGravadora("Atlantic Records");
		
        Musica m2 = new Musica();
        m2.setNome("Bohemian Rhapsody");
        m2.setAutor("Queen");
        m2.setGravadora("EMI Records");
		
        Musica m3 = new Musica();
        m3.setNome("Dance Monkey");
        m3.setAutor("Tones and I");
        m3.setGravadora("Bad Batch Records");

        // Adicionando músicas
        Playlist minhaPlaylist = new Playlist("João");
        minhaPlaylist.adicionarMusica(m1);
        minhaPlaylist.adicionarMusica(m2);
        minhaPlaylist.adicionarMusica(m3);

        // Tocando uma música aleatória da playlist
        minhaPlaylist.tocarMusicaAleatoria();

	}

}
