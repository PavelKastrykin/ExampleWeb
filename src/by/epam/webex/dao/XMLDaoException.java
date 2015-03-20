package by.epam.webex.dao;

import by.epam.webex.exception.ProjectException;

public class XMLDaoException extends ProjectException {
    private static final long serialVersionUID = 1L;

    public XMLDaoException(String msg){
        super(msg);
    }

    public XMLDaoException(String msg, Exception e){
        super(msg, e);
    }
}
