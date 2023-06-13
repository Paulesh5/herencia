public class menu {
    public static void main(String[] args) {
        Persona miPersona = new Persona(1515151515,
                "Juan",
                "Pérez",
                "Conocoto",
                "0989898989",
                "Leo",
                23);
        Persona Pedro = new Persona();

        Estudiante Paul = new Estudiante(1717171717,
                "Paul",
                "Hidalgo",
                "La Vicentina",
                "0998242424",
                "Ni idea",
                21,
                202020211,
                "paul.hidalgo02@epn.edu.ec",
                "Tercer Semestre",
                "Desarrollo de Software");

        Doctor Ana = new Doctor(1919191919,
                "Ana",
                "Tapia",
                "Floresta",
                "3216549875",
                "Leo",
                33,
                "Cardiologia",
                78946,
                "Matutino",
                "Metropolitano");

        System.out.println(Ana.getNombre() + " es Doctora");
        System.out.println("Tiene " + Ana.getEdad() + " años");
        System.out.println("Es de signo " + Ana.getSigno());
        Ana.examinar();

        EmpleadoPublico Pablo = new EmpleadoPublico(161012121,
                "Pablo",
                "Hurtado",
                "San Juan",
                "0987456321",
                "Cancer",
                36,
                "Administrador",
                "Financiero");

        System.out.println("\n" + Pablo.getNombre() + " es Empleado Publico");
        System.out.println("Su teléfono es " + Pablo.getTelefono());
        Pablo.tramitar();

        Futbolista Maritza = new Futbolista(1111111111,
                "Maritza",
                "Juanes",
                "Conocoto",
                "0963258963",
                "Tauro",
                16,
                "Liga",
                "Medio",
                17,
                "Papá",
                5);

        System.out.println("\n" + Maritza.getNombre() + " es Futbolista");
        System.out.println("Entrena " + Maritza.getHoras() + " horas diarias");
        Maritza.correr();

        Estudiante Melani = new Estudiante();

        Melani.setNombre("Melani");
        Melani.setSemestre("3er");

        System.out.println("\n" + Melani.getNombre() + " es estudiante");
        System.out.println("Está en " + Melani.getSemestre() + " semestre");
        Melani.leer();

    }
}
