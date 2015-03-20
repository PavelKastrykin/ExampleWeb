package by.epam.webex.dao.impl;

import by.epam.webex.dao.XMLDao;
import by.epam.webex.dao.XMLDaoException;

import java.util.ArrayList;
import java.util.List;

public class SaxXmlDao implements XMLDao {
    private final static SaxXmlDao instance = new SaxXmlDao();

    public static XMLDao getInstance(){
        return instance;
    }

    @Override
    public List<Object> parse(String resourseName) throws XMLDaoException{
        //stub
        List<Object> list = new ArrayList<Object>();
        list.add("First string from SAX DAO");
        list.add("Second string from SAX DAO");
        return list;
    }
}
