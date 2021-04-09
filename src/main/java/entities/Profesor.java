package entities;

import javax.persistence.*;

@Entity
@Table(name="Profesor")
public class Profesor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nombre;


    private String sexo;

    public Profesor() {
    }

    public Profesor(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return
                "id=" + id + "\n"+
                        ", nombre='" + this.nombre + "\n"+
                        ", sexo='" + this.sexo;

    }
}
