package persistence.factory;

import persistence.dao.EmailDAO;
import persistence.dao.impl.EmailDAOMySQLImpl;
import persistence.factory.DAOFactory;



public class OracleDAOFactory extends DAOFactory {

  @Override
  public EmailDAO getEmailDAO() {
    
    EmailDAO emailDao = new EmailDAOMySQLImpl();
    return emailDao;
  }



}
