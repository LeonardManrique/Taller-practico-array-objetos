package exhibicionfilmes;
/**
 *
 * @author Leonard Manrique
 */
public class Pelicula {
    private String nombrePelicula, directorPelicula, reseñaP;
    private int añoPelicula, cantBoletos;
    public Pelicula(String nombre, String director, int año, String reseña){
        nombrePelicula = nombre;
        directorPelicula = director;
        añoPelicula = año;
        reseñaP = reseña;
    }
    public String getNombre(){
        return nombrePelicula;
    }
    public String getDirector(){
        return directorPelicula;
    }
    public int getAño(){
        return añoPelicula;
    }
    public String getReseña(){
        return reseñaP;
    }
    public int getCantBoletos(){
        return cantBoletos;
    }
    public void setCantBoletos(int cantBoletos){
        this.cantBoletos = cantBoletos;
    }
}
