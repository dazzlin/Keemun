package persistence.dao;

import persistence.dto.EmailDTO;

public interface EmailDAO {
  
  //get email by email address
  public EmailDTO getEmail(String emailAddress);
  
  //insert an email 
  public void saveEmail(EmailDTO email);
  
  //update the email
  public void updateEmail(EmailDTO email);
  
  //delete the email
  public void deleteEmail(EmailDTO email);
  
}
