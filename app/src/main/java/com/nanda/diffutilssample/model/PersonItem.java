package com.nanda.diffutilssample.model;

/**
 * Created by nandagopal on 2/28/17.
 */
public class PersonItem {

  private String personId;
  private String persoName;
  private long mobileNumber;

  public PersonItem(String personId, String persoName, long mobileNumber) {
    this.personId = personId;
    this.persoName = persoName;
    this.mobileNumber = mobileNumber;
  }

  public String getPersoName() {
    return persoName;
  }

  public void setPersoName(String persoName) {
    this.persoName = persoName;
  }

  public long getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(long mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }
}
