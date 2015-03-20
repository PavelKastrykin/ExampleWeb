package by.epam.webex.controller;

import by.epam.webex.logic.CommandException;
import by.epam.webex.logic.CommandHelper;
import by.epam.webex.logic.ICommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public Controller(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String commandName = request.getParameter(RequestParameterName.COMMAND_NAME);
        ICommand command = CommandHelper.getInstance().getCommand(commandName);
        String page = null;
        try {
            page = command.execute(request);
        }
        catch (CommandException e){
            page = JspPageName.ERROR_PAGE;
        }
        catch (Exception e){
            page = JspPageName.ERROR_PAGE;
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);

        if (dispatcher != null){
            dispatcher.forward(request, response);
        }
        else {
            errorMessageDirectlyFromresponse(response);
        }
    }

    private void errorMessageDirectlyFromresponse(HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        response.getWriter().println("E R R O R");
    }
}
