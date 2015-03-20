package by.epam.webex.dao;

import java.util.List;

public interface XMLDao {
    List<Object> parse(String resourseName) throws XMLDaoException;
}
