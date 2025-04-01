package domainEntities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    private List<Materia> getCorrelativas() {
        return correlativas;
    }

    public Boolean cumpleCorrelativas(Set<Materia> materiasAprobadas){

        return materiasAprobadas.containsAll(correlativas);

    }

}