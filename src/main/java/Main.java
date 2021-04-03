import entities.Profesor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import repository.ProfesorRepository;


public class Main {

    public static void main(String[] args) {


        Session session = null;
        try {
            SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
            session = sessionFactory.openSession();

            System.out.println("Conexion base de datos creada correctamente");
        } catch (HibernateException e) {
            e.printStackTrace();
        }


        Profesor profesor = new Profesor( "juan", "hombre");

        ProfesorRepository profesorRepository= new ProfesorRepository(session);

        profesorRepository.save(profesor);




    }
}
