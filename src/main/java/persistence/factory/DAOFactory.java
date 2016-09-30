package persistence.factory;

import persistence.dao.EmailDAO;

// abstract factory design pattern
public abstract class DAOFactory {
  
  //List of DAO types supported by the factory
  public static final int MYSQL = 1;
  public static final int ORACLE = 2;
  public static final int MONGODB = 3;

  // There will be a method for each DAO that can be 
  // created. The concrete factories will have to 
  // implement these methods.
  public abstract EmailDAO getEmailDAO();


  /**
   * Factory method to get specified DAO factory.
   * @author ql69
   * @version 1.0
   * @since 09/30/2016
   * @param whichFactory It has value as: MYSQL, ORACLE, MONGODB.
   */
  public static DAOFactory getDAOFactory(int whichFactory) {
 
    switch (whichFactory) {
      case MYSQL: 
        return new MySQLDAOFactory();
      case ORACLE: 
        return new OracleDAOFactory();      
      case  MONGODB: 
        return new MongoDBDAOFactory();
      default: 
        return null;
    }
  }
  
}
