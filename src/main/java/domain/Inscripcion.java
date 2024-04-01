package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private List <Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno){
        this.alumno=alumno;
        materias=new ArrayList<>();
    }

    public boolean aprobada(){
        // la inscripcion esta aprobada si el alumno puede cursar todas las materias
        return (this.materias.stream().allMatch(materia->alumno.puedeCursar(materia)));
    }

    public void agregarMateria(Materia materia){
        this.materias.add(materia);
    }

    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materias,materias);
    }

}
