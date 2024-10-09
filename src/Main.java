import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArchivoLocal archivoLocal = new ArchivoLocal();
        Spotify spotify = new Spotify();
        GoogleDrive googleDrive = new GoogleDrive();

        ReproductorMusica adaptadorArchivoLocal = new AdaptadorArchivoLocal(archivoLocal);
        ReproductorMusica adaptadorSpotify = new AdaptadorSpotify(spotify);
        ReproductorMusica adaptadorGoogleDrive = new AdaptadorGoogleDrive(googleDrive);

        List<ReproductorMusica> listaDeReproduccion = new ArrayList<>();
        listaDeReproduccion.add(adaptadorArchivoLocal);
        listaDeReproduccion.add(adaptadorSpotify);
        listaDeReproduccion.add(adaptadorGoogleDrive);

        String[] nombres = {"cancion_local", "cancion_spotify", "cancion_drive"};

        for (int i = 0; i < listaDeReproduccion.size(); i++){
            listaDeReproduccion.get(i).reproducirMusica(nombres[i]);
        }
    }
}