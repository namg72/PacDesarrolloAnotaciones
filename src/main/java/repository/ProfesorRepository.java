package repository;

import entities.Profesor;
import org.hibernate.Session;

public class ProfesorRepository implements Repository <Profesor>{

    Session session;

    public ProfesorRepository(Session session) {
        this.session = session;
    }

    @Override
    public void save(Profesor profesor) {

        session.beginTransaction();

        session.save(profesor);

        session.getTransaction().commit();

        session.close();
    }
}
