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
public class SaveDepartmentAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        String shortName = request.getParameter("shortname");
        String name = request.getParameter("name");
        if (shortName.isEmpty() || name.isEmpty()) {
            request.setAttribute("message", "short name and name are both required.");
            request.setAttribute("name", name);
            request.setAttribute("shortname", shortName);
            return PageConstants.VIEW_DEPARTMENT_ADD;
        }
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
        Department department = new Department(shortName, name);
        for (Department d : departments) {
            if (d.getName().equals(department.getName())) {
                request.setAttribute("message", "Department with same name already exists!");
                return PageConstants.VIEW_DEPARTMENT_ADD;
            }
        }
        department.setId(getMaxId(departments) + 1l);
        departments.add(department);
        request.setAttribute("message", "Department is saved!");

        return PageConstants.VIEW_DEPARTMENT_ADD;
    }

    private long getMaxId(List<Department> departments) {
        long max = Integer.MIN_VALUE;
        for (Department department : departments) {
            if (department.getId() > max) {
                max = department.getId();
            }
        }
        return max;
    }

}
