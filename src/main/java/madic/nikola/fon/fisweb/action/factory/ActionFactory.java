/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madic.nikola.fon.fisweb.action.factory;

import madic.nikola.fon.fisweb.action.impl.LogoutAction;
import madic.nikola.fon.fisweb.action.AbstractAction;
import madic.nikola.fon.fisweb.action.impl.AddDepartmentAction;
import madic.nikola.fon.fisweb.action.impl.AllDepartmentAction;
import madic.nikola.fon.fisweb.action.impl.DeleteDepartmentAction;
import madic.nikola.fon.fisweb.action.impl.EditDepartmentAction;
import madic.nikola.fon.fisweb.action.impl.LoginAction;
import madic.nikola.fon.fisweb.action.impl.SaveDepartmentAction;
import madic.nikola.fon.fisweb.action.impl.UpdateDepartmentAction;
import madic.nikola.fon.fisweb.controller.constants.ActionConstants;

/**
 *
 * @author Nikola @FON
 */
public class ActionFactory {

    public static AbstractAction createActionFactory(String actionName) {
        AbstractAction action = null;
        if (actionName.equals(ActionConstants.URL_LOGIN)) {
            action = new LoginAction();
        }
        if (actionName.equals(ActionConstants.URL_LOGOUT)) {
            action = new LogoutAction();
        }
        if (actionName.equals(ActionConstants.URL_DEPARTMENT_ADD)) {
            action = new AddDepartmentAction();
        }
        if (actionName.equals(ActionConstants.URL_DEPARTMENT_ALL)) {
            action = new AllDepartmentAction();
        }
        if (actionName.equals(ActionConstants.URL_DEPARTMENT_SAVE)) {
            action = new SaveDepartmentAction();
        }
        if (actionName.startsWith(ActionConstants.URL_DEPARTMENT_DELETE)) {
            action = new DeleteDepartmentAction();
        }
        if (actionName.startsWith(ActionConstants.URL_DEPARTMENT_EDIT)) {
            action = new EditDepartmentAction();
        }
        if (actionName.startsWith(ActionConstants.URL_DEPARTMENT_UPDATE)) {
            action = new UpdateDepartmentAction();
        }
        return action;
    }
}
