package domainEntities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class InscripcionTest {
    @Test
    @DisplayName("A un alumno que cumple todas las correlativas de las materias a las que se Inscribio se le aprueba la isncripcion")
    void aprobada() {

        Materia disenoDeSistemas = new Materia("Diseno de Sistemas");
        Materia analisisMatematico = new Materia("AnalisisMatematico");
        Materia analisisDeSistemas = new Materia("AnalisisDeSistemas");
        List<Materia> correlativasAnalisis = new ArrayList<>();
        List<Materia> correlativasDiseno = new ArrayList<>();
        correlativasDiseno.add(analisisDeSistemas);
        analisisMatematico.setCorrelativas(correlativasAnalisis);
        disenoDeSistemas.setCorrelativas(correlativasDiseno);

        Set<Materia> materiasAprobadasJuan = new HashSet<>();
        materiasAprobadasJuan.add(analisisDeSistemas);
        Alumno nuevoAlumno = new Alumno("Juan Perez", "214.132-2");
        nuevoAlumno.setMateriasAprobadas(materiasAprobadasJuan);

        Inscripcion inscripcion = new Inscripcion(nuevoAlumno);
        List<Materia> materiasInscripcion = new ArrayList<>();
        materiasInscripcion.add(analisisMatematico);
        materiasInscripcion.add(disenoDeSistemas);
        inscripcion.setMateriasInscriptas(materiasInscripcion);

        assertTrue(inscripcion.aprobada());

    }
    @Test
    @DisplayName("A un alumno que no cumple las correlativas de las materias a las que se inscribio se le rechaza la inscripcion")
    void noAprobada() {

        Materia disenoDeSistemas = new Materia("Diseno de Sistemas");
        Materia analisisMatematico = new Materia("AnalisisMatematico");
        Materia analisisDeSistemas = new Materia("AnalisisDeSistemas");
        List<Materia> correlativasAnalisis = new ArrayList<>();
        List<Materia> correlativasDiseno = new ArrayList<>();
        correlativasDiseno.add(analisisDeSistemas);
        analisisMatematico.setCorrelativas(correlativasAnalisis);
        disenoDeSistemas.setCorrelativas(correlativasDiseno);

        Set<Materia> materiasAprobadasJuan = new HashSet<>();
        Alumno nuevoAlumno = new Alumno("Juan Perez", "214.132-2");
        nuevoAlumno.setMateriasAprobadas(materiasAprobadasJuan);

        Inscripcion inscripcion = new Inscripcion(nuevoAlumno);
        List<Materia> materiasInscripcion = new ArrayList<>();
        materiasInscripcion.add(analisisMatematico);
        materiasInscripcion.add(disenoDeSistemas);
        inscripcion.setMateriasInscriptas(materiasInscripcion);

        assertFalse(inscripcion.aprobada());

    }

}