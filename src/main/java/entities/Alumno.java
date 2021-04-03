package entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Table (name="Alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    private String nombre;


    private String nacionalidad;


    private int edad;


    private String sexo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Modulo> modulos;       //creamos uan lista de tipo Modulo para poder incluir mas de un Modulo



    public Alumno() {
    }


    public Alumno(String nombre, String nacionalidad, int edad, String sexo, Set<Modulo> modulos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
        this.modulos = modulos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Set<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(Set<Modulo> modulos) {
        this.modulos = modulos;
    }



    @Override
    public String toString() {
        return
                "id=" + id +"\n"+
                        "nombre='" + nombre + "\n"+
                        "nacionalidad='" + nacionalidad + "\n"+
                        "edad=" + edad +"\n"+
                        "sexo='" + sexo+"\n"+
                        "modulo='" + modulos ;
    }
}
