import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        try {
            SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
            Session session=sessionFactory.openSession();
            System.out.println("Conexion base de datos creada correctamente");
        } catch (HibernateException e) {
            e.printStackTrace();
            System.out.println("Error al crear conexion con base de datos");
        }

    }
}
