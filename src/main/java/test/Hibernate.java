package test;

import com.pedro.domain.Persona;
import java.util.*;
import jakarta.persistence.*;

public class Hibernate {
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ListadoPersonas");
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);     
        List<Persona> personas = query.getResultList();
        for(Persona p:personas){
            System.out.println("Persona: " + p);
        }
    }
}
