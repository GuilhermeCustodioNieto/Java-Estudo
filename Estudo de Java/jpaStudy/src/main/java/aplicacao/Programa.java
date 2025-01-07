package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

        EntityManager em = emf.createEntityManager();

        Pessoa p = new Pessoa(2, null, null);

        em.remove(p);

        System.out.println("Done!");
        em.close();
        emf.close();
    }
}
