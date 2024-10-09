public class AdaptadorArchivoLocal implements ReproductorMusica{
    private ArchivoLocal archivoLocal;
    public AdaptadorArchivoLocal (ArchivoLocal archivoLocal){
        this.archivoLocal = archivoLocal;
    }
    @Override
    public void reproducirMusica(String nombre){
        String musicaArchivoLocal = nombre + ".mp3";
        archivoLocal.reproducirArchivoLocal(musicaArchivoLocal);
    }
}
