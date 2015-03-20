package by.epam.webex.dao;

import by.epam.webex.dao.impl.SaxXmlDao;

public class XMLDAOFactory {
    private final static XMLDAOFactory instance = new XMLDAOFactory();

    public static XMLDAOFactory getInstance(){
        return instance;
    }

    public XMLDao getDAO(DAOType type) throws XMLDaoException{
        XMLDao dao;
        switch (type){
            case SAX:
                return SaxXmlDao.getInstance();
            default:
                throw new XMLDaoException("No such DAO");
        }
    }

    public enum DAOType{
        SAX, STAX, DOM;
    }
}
