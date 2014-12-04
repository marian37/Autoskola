package sk.upjs.ics.paz1c.autoskola;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import sk.upjs.ics.paz1c.dao.*;
import sk.upjs.ics.paz1c.databazoveDao.*;

public enum BeanFactory {

    INSTANCE;

    private final String PASSWORD_FILE = "password.txt";

    private StudentiDao studentiDao;

    private VozidlaDao vozidlaDao;

    private InstruktoriDao instruktoriDao;

    private JazdyDao jazdyDao;

    private SkuskyDao skuskyDao;

    private JdbcTemplate jdbcTemplate;

    private String password;

    public StudentiDao getStudentiDao() {
        if (studentiDao == null) {
            studentiDao = new DatabazoveStudentiDao(jdbcTemplate());
        }
        return this.studentiDao;
    }

    public VozidlaDao getVozidlaDao() {
        if (vozidlaDao == null) {
            vozidlaDao = new DatabazoveVozidlaDao(jdbcTemplate());
        }
        return this.vozidlaDao;
    }

    public InstruktoriDao getInstruktoriDao() {
        if (instruktoriDao == null) {
            instruktoriDao = new DatabazoveInstruktoriDao(jdbcTemplate());
        }
        return this.instruktoriDao;
    }

    public JazdyDao getJazdyDao() {
        if (jazdyDao == null) {
            jazdyDao = new DatabazoveJazdyDao(jdbcTemplate());
        }
        return this.jazdyDao;
    }

    public SkuskyDao getSkuskyDao() {
        if (skuskyDao == null) {
            skuskyDao = new DatabazoveSkuskyDao(jdbcTemplate());
        }
        return this.skuskyDao;
    }

    public JdbcTemplate jdbcTemplate() {
        if (this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(dataSource());
        }
        return this.jdbcTemplate;
    }

    private DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://db4free.net:3306/autoskolapaz1c?zeroDateTimeBehavior=convertToNull");
        dataSource.setUser("autoskolapaz1c");
        dataSource.setPassword(password());

        return dataSource;
    }

    private String password() {
        if (password == null) {
            Scanner scanner = null;
            try {
                scanner = new Scanner(new File(PASSWORD_FILE));
                password = scanner.next();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BeanFactory.class.getName()).log(Level.SEVERE, "Zlyhalo nacitanie hesla zo suboru", ex);
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }
        return password;
    }

}
