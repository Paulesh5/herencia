public class EmpleadoPublico extends Persona{
    private String puesto;
    private String cargo;

    public EmpleadoPublico(int ci,
                           String nombre,
                           String apellido,
                           String direccion,
                           String telefono,
                           String signo,
                           int edad,
                           String puesto,
                           String cargo) {
        super(ci, nombre, apellido, direccion, telefono, signo, edad);
        this.puesto=puesto;
        this.cargo=cargo;
    }

    public void tramitar(){
        System.out.println("Este es el método tramitar");
    }
}
