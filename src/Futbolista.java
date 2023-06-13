public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int num_camiseta;
    private String representante;
    private int horas;

    public Futbolista(int ci,
                      String nombre,
                      String apellido,
                      String direccion,
                      String telefono,
                      String signo,
                      int edad,
                      String equipo,
                      String posicion,
                      int num_camiseta,
                      String representante,
                      int horas) {
        super(ci, nombre, apellido, direccion, telefono, signo, edad);
        this.equipo=equipo;
        this.posicion=posicion;
        this.num_camiseta=num_camiseta;
        this.representante=representante;
        this.horas=horas;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        this.num_camiseta = num_camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void correr(){
        System.out.println("Este es el método correr");
    }
}
