package isil.pe.ep1.castaneda.Alumno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Alumno")
public class AlumnoController {

    @GetMapping
    @RequestMapping("/Lista")

    public List<Alumno> getAlumno(){
        Alumno alumno1 = new Alumno(01,"brayan","Castañeda","73334919","Comunicacion");
        Alumno alumno2 = new Alumno(02,"Yan","Castañeda","142637372","Matematica");
        return List.of(alumno1,alumno2);
    }
}
