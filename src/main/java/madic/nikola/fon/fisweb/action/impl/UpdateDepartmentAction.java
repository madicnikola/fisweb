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
public class UpdateDepartmentAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        long id = Long.valueOf(request.getPathInfo().split("/")[3]);
        String shortName = request.getParameter("shortname");
        String name = request.getParameter("name");
        request.setAttribute("id", id);
        request.setAttribute("name", name);
        request.setAttribute("shortname", shortName);
        if (shortName.isEmpty() || name.isEmpty()) {
            request.setAttribute("message", "short name and name are both required.");
            return PageConstants.VIEW_DEPARTMENT_EDIT;
        }
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
        Department department = new Department(shortName, name);
        department.setId(id);
        Department d = departments.get(departments.indexOf(department));
        d.setName(name);
        d.setShortName(shortName);
        request.setAttribute("message", "Department has been updated.");

        return PageConstants.VIEW_DEPARTMENT_EDIT;
    }

}
