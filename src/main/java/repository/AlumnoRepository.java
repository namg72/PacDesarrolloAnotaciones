package repository;

import entities.Alumno;
import org.hibernate.Session;

public class AlumnoRepository implements Repository<Alumno> {

    Session session;

    public AlumnoRepository(Session session) {
        this.session = session;
    }

    @Override
    public void save(Alumno alumno) {

        session.beginTransaction();

        session.save(alumno);

        session.getTransaction().commit();

        session.close();

    }
}
