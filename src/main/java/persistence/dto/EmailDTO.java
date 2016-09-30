package persistence.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class EmailDTO implements Serializable {
  
  /**
   * generatedID, whether it is needed? waiting for solution.
   * @since 09/30/2016
   */
  private static final long serialVersionUID = -2441338428468554899L;
  
  @Column(name = "emailAddress")
  private String emailAddress;

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

}
