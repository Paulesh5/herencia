public class Doctor extends Persona{
    private String especialidad;
    private int codigo_doctor;
    private String horario;
    private String hospital;

    public Doctor(int ci,
                  String nombre,
                  String apellido,
                  String direccion,
                  String telefono,
                  String signo,
                  int edad,
                  String especialidad,
                  int codigo_doctor,
                  String horario,
                  String hospital) {
        super(ci, nombre, apellido, direccion, telefono, signo, edad);
        this.especialidad=especialidad;
        this.codigo_doctor=codigo_doctor;
        this.horario=horario;
        this.hospital=hospital;
    }

    public void examinar(){
        System.out.println("Este es el método examinar.");
    }
}
