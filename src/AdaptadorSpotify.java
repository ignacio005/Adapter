public class AdaptadorSpotify implements ReproductorMusica{
    private Spotify spotify;
    public AdaptadorSpotify(Spotify spotify){
        this.spotify = spotify;
    }
    @Override
    public void reproducirMusica(String nombre){
        String musicaSpotify = nombre + " en spotify.";
        spotify.reproducirSpotify(musicaSpotify);
    }
}
