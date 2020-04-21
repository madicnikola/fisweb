/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madic.nikola.fon.fisweb.model.viewResolver;

import java.util.HashMap;
import java.util.Map;
import madic.nikola.fon.fisweb.controller.constants.PageConstants;

/**
 *
 * @author Nikola
 */
public class ViewResolver {

    private final Map<String, String> viewPageMap;

    public ViewResolver() {
        viewPageMap = new HashMap<String, String>() {
            {   //key = view, value=page
                put(PageConstants.VIEW_HOME, PageConstants.PAGE_HOME);
                put(PageConstants.VIEW_LOGIN, PageConstants.PAGE_LOGIN);
                put(PageConstants.VIEW_DEFAULT_ERROR, PageConstants.PAGE_DEFAULT_ERROR);
                put(PageConstants.VIEW_DEPARTMENT_ADD, PageConstants.PAGE_DEPARTMENT_ADD);
                put(PageConstants.VIEW_DEPARTMENT_ALL, PageConstants.PAGE_DEPARTMENT_ALL);
                put(PageConstants.VIEW_DEPARTMENT_EDIT, PageConstants.PAGE_DEPARTMENT_EDIT);
            }
        };
    }

    public String getPage(String view) {
        return viewPageMap.get(view);
    }

}
