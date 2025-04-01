package domainEntities;



import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Inscripcion {
    private Alumno alumnoInscripto;
    private List<Materia> materiasInscriptas;


    public Inscripcion(Alumno alumnoInscripto) {
        this.alumnoInscripto = alumnoInscripto;
        this.materiasInscriptas = new ArrayList<>();
    }

    public List<Materia> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public Boolean aprobada() {

        return materiasInscriptas.stream().allMatch(materia -> materia.cumpleCorrelativas(alumnoInscripto.getMateriasAprobadas()));
    }
}
