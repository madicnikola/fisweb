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
public class EditDepartmentAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        Department d = getDepartment(request);

        request.setAttribute("id", d.getId());
        request.setAttribute("name", d.getName());
        request.setAttribute("shortname", d.getShortName());
        return PageConstants.VIEW_DEPARTMENT_EDIT;
    }

    private Department getDepartment(HttpServletRequest request) throws NumberFormatException {
        long id = Long.valueOf(request.getPathInfo().split("/")[3]);
        Department department = new Department();
        department.setId(id);
        List<Department> departments = ((List<Department>) request.getServletContext().getAttribute("departments"));
        return departments.get(departments.indexOf(department));
    }

}
