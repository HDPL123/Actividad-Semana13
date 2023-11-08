import clases.Direccion;
import clases.EstudianteTemporal;
import clases.EstudianteUniversitario;
import clases.NumeroCelular;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<EstudianteUniversitario> estudiantes = new ArrayList<>();
        EstudianteUniversitario estudiante1 = new EstudianteUniversitario("Daniel", "Pillpe", 19, "Ingenieria de Software", new Direccion("Separadora Industrial", "calle", "distrito", "provincia"), new ArrayList<>());
        EstudianteUniversitario estudiante2 = new EstudianteUniversitario("Nombre", "Apellido", 30, "Carrera", new Direccion("Direccion", "calle", "distrito1", "provincia1"), new ArrayList<>());
        EstudianteUniversitario estudiante3 = new EstudianteUniversitario("Nombre1", "Apellido1", 30, "Carrera1", new Direccion("Direccion1", "calle1", "distrito2", "provincia2"), new ArrayList<>());
        EstudianteUniversitario estudiante4 = new EstudianteUniversitario("Nombre2", "Apellido2", 30, "Carrera2", new Direccion("Direccion2", "calle2", "distrito3", "provincia3"), new ArrayList<>());
        EstudianteUniversitario estudiante5 = new EstudianteUniversitario("Nombre3", "Apellido3", 30, "Carrera3", new Direccion("Direccion3", "calle3", "distrito4", "provincia4"), new ArrayList<>());
        EstudianteUniversitario estudiante6 = new EstudianteUniversitario("Nombre4", "Apellido4", 30, "Carrera4", new Direccion("Direccion4", "calle4", "distrito5", "provincia5"), new ArrayList<>());
        EstudianteUniversitario estudiante7 = new EstudianteUniversitario("Nombre5", "Apellido5", 30, "Carrera5", new Direccion("Direccion5", "calle5", "distrito6", "provincia6"), new ArrayList<>());
        EstudianteUniversitario estudiante8 = new EstudianteUniversitario("Nombre6", "Apellido6", 30, "Carrera6", new Direccion("Direccion6", "calle6", "distrito7", "provincia7"), new ArrayList<>());
        EstudianteUniversitario estudiante9 = new EstudianteUniversitario("Nombre7", "Apellido7", 30, "Carrera7", new Direccion("Direccion7", "calle7", "distrito8", "provincia8"), new ArrayList<>());
        EstudianteUniversitario estudiante10 = new EstudianteUniversitario("Nombre8", "Apellido8", 30, "Carrera8", new Direccion("Direccion8", "calle8", "distrito9", "provincia9"), new ArrayList<>());


        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);
        estudiantes.add(estudiante6);
        estudiantes.add(estudiante7);
        estudiantes.add(estudiante8);
        estudiantes.add(estudiante9);
        estudiantes.add(estudiante10);


        String nombreBuscado = "NombreBuscado";
        Optional<EstudianteUniversitario> estudianteEncontrado = estudiantes.stream().filter(s -> s.getNombre().equals(nombreBuscado)).findFirst();

        String direccionBuscada = "DireccionBuscada";
        Optional<EstudianteUniversitario> estudianteEncontrado1 = estudiantes.stream().filter(s -> s.getDireccion().equals(direccionBuscada)).findFirst();


        String numeroCelularBuscado = "numeroCelular";
        List<EstudianteUniversitario> estudiantesConCelular = estudiantes.stream()
                .filter(estudiante -> estudiante.getCelulares()
                        .stream()
                        .anyMatch(celular -> celular.getNumero().equals(numeroCelularBuscado)))
                .collect(Collectors.toList());


        String numeroCelularA = "numeroA";
        String numeroCelularB = "numeroB";
        List<EstudianteUniversitario> estudiantesConAmbosCelulares = estudiantes.stream()
                .filter(estudiante -> estudiante.getCelulares()
                        .stream()
                        .anyMatch(celular -> celular.getNumero().equals(numeroCelularA)) &&
                        estudiante.getCelulares()
                                .stream()
                                .anyMatch(celular -> celular.getNumero().equals(numeroCelularB)))
                .collect(Collectors.toList());

        List<EstudianteTemporal> estudiantesTemporales = new ArrayList<>();

        EstudianteTemporal temporal1 = new EstudianteTemporal("name1", 19, new Direccion("avenida1", "calle1", "distrito1", "provincia1"), new ArrayList<>());
        temporal1.getCelulares().add(new NumeroCelular("987654321"));
        EstudianteTemporal temporal2 = new EstudianteTemporal("name2", 20, new Direccion("avenida2", "calle2", "distrito2", "provincia2"), new ArrayList<>());
        temporal2.getCelulares().add(new NumeroCelular("987654321"));
        EstudianteTemporal temporal3 = new EstudianteTemporal("name3", 20, new Direccion("avenida3", "calle3", "distrito3", "provincia3"), new ArrayList<>());
        temporal3.getCelulares().add(new NumeroCelular("987654321"));
        EstudianteTemporal temporal4 = new EstudianteTemporal("name4", 18, new Direccion("avenida4", "calle4", "distrito4", "provincia4"), new ArrayList<>());
        temporal4.getCelulares().add(new NumeroCelular("987654321"));
        EstudianteTemporal temporal5 = new EstudianteTemporal("name5", 24, new Direccion("avenida5", "calle5", "distrito5", "provincia5"), new ArrayList<>());
        temporal5.getCelulares().add(new NumeroCelular("987654321"));
        EstudianteTemporal temporal6 = new EstudianteTemporal("name6", 30, new Direccion("avenida6", "calle6", "distrito6", "provincia6"), new ArrayList<>());
        temporal6.getCelulares().add(new NumeroCelular("987654321"));
        EstudianteTemporal temporal7 = new EstudianteTemporal("name7", 26, new Direccion("avenida7", "calle7", "distrito7", "provincia7"), new ArrayList<>());
        temporal7.getCelulares().add(new NumeroCelular("987654321"));

        List<EstudianteUniversitario> estudiantesConvertidos = estudiantesTemporales.stream()
                .map(estudianteTemporal -> new EstudianteUniversitario(
                        estudianteTemporal.getNombre(),
                        "",
                        estudianteTemporal.getEdad(),
                        "",
                        estudianteTemporal.getDireccion(),
                        estudianteTemporal.getCelulares()))
                .collect(Collectors.toList());

        List<String> nombresEstudiantes = estudiantesConvertidos.stream()
                .map(EstudianteUniversitario::getNombre)
                .collect(Collectors.toList());

        String listaNombresComoString = String.join(", ", nombresEstudiantes);

        List<String> nombresEnMayusculas = nombresEstudiantes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        nombresEstudiantes.sort(String::compareTo);

        List<String> nombresFiltradosConR = nombresEstudiantes.stream()
                .filter(nombre -> nombre.startsWith("R"))
                .collect(Collectors.toList());
        nombresFiltradosConR.sort(String::compareTo);

    }
}
