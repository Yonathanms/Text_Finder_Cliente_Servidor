package paquete.modelo;

public class ArchivoView {

    private String nombrefile;
    private String dirfile;

    public ArchivoView(String nombrefile, String dirfile) {
        this.nombrefile = nombrefile;
        this.dirfile = dirfile;
    }

    public String getNombrefile() {
        return nombrefile;
    }

    public void setNombrefile(String nombrefile) {
        this.nombrefile = nombrefile;
    }

    public String getDirfile() {
        return dirfile;
    }

    public void setDirfile(String dirfile) {
        this.dirfile = dirfile;
    }
}
