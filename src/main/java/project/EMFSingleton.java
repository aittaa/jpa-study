package project;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFSingleton {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");

    public static EntityManagerFactory getInstance() {
        return emf;
    }
    public static void close(){
        emf.close();
    }
}
