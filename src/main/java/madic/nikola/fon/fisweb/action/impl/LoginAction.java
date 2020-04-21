/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madic.nikola.fon.fisweb.action.impl;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import madic.nikola.fon.fisweb.action.AbstractAction;
import madic.nikola.fon.fisweb.controller.constants.PageConstants;
import madic.nikola.fon.fisweb.model.User;

/**
 *
 * @author Nikola @FON
 */
public class LoginAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("====================================================");
        System.out.println("====================LoginAction=====================");
        System.out.println(email + "\t" + password);
        System.out.println("====================================================");
        request.setAttribute("email", email);
        request.setAttribute("password", password);
        User user = findUser(request, email);
        if (user == null) {
            request.setAttribute("message", "User does not exist!");
            return PageConstants.VIEW_LOGIN;
        } else {
            //user exists
            if (!user.getPassword().equals(password)) {
                request.setAttribute("message", "Wrong password, check credentials and try again!");
                return PageConstants.VIEW_LOGIN;
            }
            request.getSession(true).setAttribute("loginUser", user);
            return PageConstants.VIEW_HOME;
        }
    }

    private User findUser(HttpServletRequest request, String email) {
        List<User> users = (List<User>) request.getServletContext().getAttribute("users");
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
