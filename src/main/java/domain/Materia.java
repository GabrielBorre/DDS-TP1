package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List <Materia> correlativas;

    public Materia (String nombre){
        this.nombre=nombre;
        correlativas=new ArrayList<>();
    }

    public void agregarCorrelativas(Materia ... correlativas){
        Collections.addAll(this.correlativas,correlativas);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia ... correlativas){
        Collections.addAll(this.correlativas,correlativas);
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}