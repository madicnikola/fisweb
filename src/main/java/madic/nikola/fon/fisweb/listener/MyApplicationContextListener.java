/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madic.nikola.fon.fisweb.listener;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import madic.nikola.fon.fisweb.model.Department;
import madic.nikola.fon.fisweb.model.User;

/**
 * Web application lifecycle listener.
 *
 * @author Nikola @FON
 */
@WebListener
public class MyApplicationContextListener implements ServletContextListener {

    public MyApplicationContextListener() {
        System.out.println("======================================================");
        System.out.println("========= MyApplicationContextListener=================");
        System.out.println("=======================================================");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("======================================================");
        System.out.println("=========        contextInitialized  =================");
        System.out.println("=======================================================");
        //lista korisnika
        sce.getServletContext().setAttribute("users", createUsers());
        sce.getServletContext().setAttribute("departments", createDepartments());

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    private List<User> createUsers() {
        return new ArrayList<User>() {
            {
                add(new User("Pera", "Peric", "pera@pera", "pera"));
                add(new User("Milica", "Madic", "mica@milica", "mica"));
                add(new User("jovan", "jovanic", "jovan@jovan", "jovan"));
            }
        };
    }

    private Object createDepartments() {
        return new ArrayList<Department>() {
            {
                add(new Department(1l, "SILAB", "Laboratorija za softversko inzinjerstvo"));
                add(new Department(2l, "AI", "Laboratorija za vestacku inteligenciju"));
                add(new Department(154l, "IS", "Informacioni sistemi"));
            }
        };
    }
}
