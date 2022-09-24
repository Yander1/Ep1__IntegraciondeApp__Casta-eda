package isil.pe.ep1.castaneda.Alumno;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alumno {
    Integer id;
    String nombre;
    String Apellido;
    String dni;
    String curso;
}
