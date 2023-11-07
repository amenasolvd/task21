package Peoples;

public abstract class Person {

    private String firstname;
    private String lastname;
    private final String emailAdd;
    private final String phoneNo;

   public Person (String firstname, String lastname, String emailAdd, String phoneNo){
    this.firstname = firstname;
    this.lastname = lastname;
    this.emailAdd = emailAdd;
    this.phoneNo = phoneNo;
    }
    public String getFirstname(){
        this.firstname = firstname;
        return firstname;
    }
    public void setFirstname(){
        this.firstname = firstname;
    }

    public String getLastname(){
       return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailAdd(){
       return emailAdd;
    }
    public String getPhoneNo(){
        return phoneNo;
    }

    public String setPhoneNo(){
        return phoneNo;
    }
}