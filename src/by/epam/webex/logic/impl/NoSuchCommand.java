package by.epam.webex.logic.impl;

import by.epam.webex.controller.JspPageName;
import by.epam.webex.logic.CommandException;
import by.epam.webex.logic.ICommand;

import javax.servlet.http.HttpServletRequest;

public class NoSuchCommand implements ICommand{

    @Override
    public String execute(HttpServletRequest request) throws CommandException{
        //stub
        return JspPageName.ERROR_PAGE;
    }
}
