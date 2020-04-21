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
import madic.nikola.fon.fisweb.model.Department;

/**
 *
 * @author Nikola
 */
public class DeleteDepartmentAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        long id = Long.valueOf(request.getPathInfo().split("/")[3]);
        Department department = new Department();
        department.setId(id);
        boolean isDeleted = ((List<Department>) request.getServletContext().getAttribute("departments")).remove(department);
        if (!isDeleted) {
            request.setAttribute("message", "Department with id " + id + " can't be deleted.");
            return PageConstants.VIEW_DEFAULT_ERROR;
        }
        request.setAttribute("message", "Department with id: " + id + " is deleted!");
        return PageConstants.VIEW_DEPARTMENT_ALL;

    }

}
