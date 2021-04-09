import entities.Alumno;
import entities.Modulo;
import entities.Profesor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import repository.ModuloRepository;
import repository.ProfesorRepository;

import java.util.Scanner;


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

        int accion;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("MENU" + "\n" + "-----------" + "\n" + "-----------" + "\n" + "\n" +
                    "1.- Introduce un Modulo" + "\n" +
                    "2.- Introduce un Proesor" + "\n" +
                    "3.- Introduce un Alumno" + "\n" +
                    "4.- Salir");

            accion=sc.nextInt();

            menu(sc, session);


        }while(accion !=4);







    }
    public static void menu(Scanner sc, Session session) {

        Profesor profesor ;
        Alumno alumno;
        Modulo modulo;

        int accion=sc.nextInt();


        switch (accion) {


            case 2:
                System.out.println("introduce el nombre del profesor");
                String profesorNombre = sc.next();
                System.out.println("introduce el Sexo del profesor");
                String profesorSexo = sc.next();
                profesor = new Profesor(profesorNombre, profesorSexo);
                ProfesorRepository profesorRepository = new ProfesorRepository(session);
                profesorRepository.save(profesor);
                System.out.println("Inser into Profesor " + profesor.toString());
                break;


           /* case 3:
                System.out.println("introduce el nombre del alumno");
                String alumnoNombre = sc.next();
                System.out.println("introduce la nacionalidad del alumno");
                String alumnoNac = sc.next();
                System.out.println("introduce la edad del alumno");
                int alumnoEdad = sc.nextInt();
                System.out.println("Intoduce el sexo del alumno");
                String alumnoSex = sc.next();


                modulo = new Modulo(moduloNombre, moduloCodigo);
                ModuloRepository moduloRepository= new ModuloRepository(session);
                moduloRepository.save(modulo);
                System.out.println("Inser into Modulo "+modulo.toString());
                break;
            */
            default:
                System.out.println("Opcion incorrecta");

        }//fin switch


    }// Fin menu

    //Metodo insertar alumnos
    private static void saveAlumno(Session session, Alumno alumno){

        session.beginTransaction();
        session.save(alumno);
        session.getTransaction().commit();
        session.close();

    }
    //Metodo insertar profesores
    private static void saveProfesor(Session session, Profesor profesor){

        session.beginTransaction();
        session.save(profesor);
        session.getTransaction().commit();
        session.close();

    }
    //Metodo insertar modulos
    private static void saveModulo(Session session, Modulo modulo){

        session.beginTransaction();
        session.save(modulo);
        session.getTransaction().commit();
        session.close();

    }


}
