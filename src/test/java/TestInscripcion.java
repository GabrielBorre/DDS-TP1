import domain.Alumno;
import domain.Materia;
import domain.Inscripcion;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestInscripcion {

    @Test
    public void alumnoConInscripcionAprobada(){
        Alumno unAlumno= new Alumno("Martin","Rodriguez",203);
        Materia disenio= new Materia ("Diseño de sistemas");
        Materia algoritmos = new Materia ("Algoritmos");
        Materia paradigmas= new Materia("Paradigmas de Programacion");

        disenio.agregarCorrelativas(algoritmos,paradigmas);

        unAlumno.agregarMateriasAprobadas(algoritmos,paradigmas);

        Inscripcion unaInscripcion=new Inscripcion (unAlumno);

        unaInscripcion.agregarMateria(disenio);

        assertTrue(unaInscripcion.aprobada());


    }

    @Test

    public void AlumnoConInscripcionRechazada(){
        Alumno unAlumno= new Alumno("Martin","Rodriguez",203);
        Materia disenio= new Materia ("Diseño de sistemas");
        Materia algoritmos = new Materia ("Algoritmos");
        Materia paradigmas= new Materia("Paradigmas de Programacion");
        Materia arquitectura = new Materia("Arquitectura de Computadoras");
        Materia operativos= new Materia("Sistemas Operativos");


        disenio.agregarCorrelativas(algoritmos,paradigmas);
        operativos.agregarCorrelativas(arquitectura,algoritmos);


        unAlumno.agregarMateriasAprobadas(algoritmos,paradigmas);

        Inscripcion unaInscripcion=new Inscripcion (unAlumno);

        unaInscripcion.agregarMaterias(disenio,operativos);

        assertFalse(unaInscripcion.aprobada());

    }



}
