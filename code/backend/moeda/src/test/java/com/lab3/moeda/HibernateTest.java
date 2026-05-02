package com.lab3.moeda;

import com.lab3.moeda.model.AlunoEntity;
import com.lab3.moeda.model.UsuarioAcademicoEntity;
import com.lab3.moeda.model.UsuarioEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HibernateTest {
    private SessionFactory sessionFactory;

    @BeforeEach
    protected void setUp() throws Exception {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    @AfterEach
    protected void tearDown() throws Exception {
        if(sessionFactory != null) sessionFactory.close();
    }

    @Test
    void saveMyFirstObjectToTheDB() {
        UsuarioAcademicoEntity alice = new AlunoEntity("Alice", "12345678910", "123456789", "Rua 1", "UFMG", "Biologia");

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            // Salva o aluno no BD
            session.persist(alice);

            session.getTransaction().commit();
        }
     }

}
