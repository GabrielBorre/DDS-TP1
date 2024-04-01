package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private List <Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer legajo ){
        this.nombre=nombre;
        this.apellido=apellido;
        this.legajo=legajo;
        materiasAprobadas=new ArrayList<>();
    }

    public boolean puedeCursar (Materia materia) {
        //puede cursar una materia si aprobo todas sus correlativas
        return (this.materiasAprobadas.containsAll(materia.getCorrelativas()));
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
