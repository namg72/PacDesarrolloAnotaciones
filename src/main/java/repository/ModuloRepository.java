package repository;

import com.sun.tools.corba.se.idl.constExpr.Modulo;
import org.hibernate.Session;

public class ModuloRepository implements Repository <Modulo> {

    Session session;

    public ModuloRepository(Session session) {
        this.session = session;
    }

    @Override
    public void save(Modulo modulo) {

        session.beginTransaction();

        session.save(modulo);

        session.getTransaction().commit();

        session.close();

    }
}
