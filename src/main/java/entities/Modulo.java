package entities;

import javax.persistence.*;

@Entity
@Table (name="Modulo")
public class Modulo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;


    private String codigo;


    public Modulo() {
    }

    public Modulo(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    @Override
    public String toString() {
        return
                "id=" + id +"\n"+
                        ", nombre='" + nombre + "\n"+
                        ", codigo='" + codigo;

    }
}