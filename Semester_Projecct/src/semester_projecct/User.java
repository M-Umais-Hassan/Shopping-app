package semester_projecct;

public class User {
    private String F_Name;
    private String L_Name;
    private String User_Name;
    private String Password;
    private String Gender;
    private String Address;
    private String contact;
    private String mail;

    public User(String F_Name, String L_Name, String User_Name, String Password, String Gender, String Address, String contact, String mail) {
        this.F_Name = F_Name;
        this.L_Name = L_Name;
        this.User_Name = User_Name;
        this.Password = Password;
        this.Gender = Gender;
        this.Address = Address;
        this.contact = contact;
        this.mail = mail;
    }

    public String getF_Name() {
        return F_Name;
    }

    public void setF_Name(String F_Name) {
        this.F_Name = F_Name;
    }

    public String getL_Name() {
        return L_Name;
    }

    public void setL_Name(String L_Name) {
        this.L_Name = L_Name;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
}
