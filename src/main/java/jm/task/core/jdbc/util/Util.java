package jm.task.core.jdbc.util;


import jm.task.core.jdbc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД
    public static SessionFactory sessionFactory;


    public static Connection connection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/itmentor", "postgres", "root");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection error");
            throw new RuntimeException(e);
        }
    }
}
