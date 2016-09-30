package persistence.dao.impl;

import persistence.dao.EmailDAO;
import persistence.dto.EmailDTO;

public class EmailDAOMySQLImpl implements EmailDAO {

  @Override
  public EmailDTO getEmail(String emailAddress) {
    
    //It is just test, not real implementation
    EmailDTO email = new EmailDTO();
    email.setEmailAddress(emailAddress);
    return email;
  }

  @Override
  public void saveEmail(EmailDTO email) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void updateEmail(EmailDTO email) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteEmail(EmailDTO email) {
    // TODO Auto-generated method stub
    
  }

  
    
}
