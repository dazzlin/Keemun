package indentity;

import java.io.Serializable;

import domaincontract.ValueObject;

public class Email implements ValueObject, Serializable {
  private final String emailaddress;

  public Email(String email) {
    emailaddress = email;
  }

}
