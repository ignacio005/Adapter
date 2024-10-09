public class AdaptadorGoogleDrive implements ReproductorMusica{
    private GoogleDrive googleDrive;
    public AdaptadorGoogleDrive(GoogleDrive googleDrive){
        this.googleDrive = googleDrive;
    }
    @Override
    public void reproducirMusica(String nombre){
        String musicaGooleDrive = nombre + " en google drive.";
        googleDrive.reproducirGoogleDrive(musicaGooleDrive);
    }

}
