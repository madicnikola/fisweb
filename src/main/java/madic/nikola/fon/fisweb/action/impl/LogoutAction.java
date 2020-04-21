/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madic.nikola.fon.fisweb.action.impl;

import javax.servlet.http.HttpServletRequest;
import madic.nikola.fon.fisweb.action.AbstractAction;
import madic.nikola.fon.fisweb.controller.constants.PageConstants;

/**
 *
 * @author Nikola
 */
public class LogoutAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        request.getSession().invalidate();
        request.setAttribute("logoutmessage", "Goodbye!");
        return PageConstants.VIEW_LOGIN;
    }

}
