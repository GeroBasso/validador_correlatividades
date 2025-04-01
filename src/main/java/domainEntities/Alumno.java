package domainEntities;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Alumno {
    private String nombre;
    private String legajo;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new HashSet<>();
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Boolean aprobo(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
