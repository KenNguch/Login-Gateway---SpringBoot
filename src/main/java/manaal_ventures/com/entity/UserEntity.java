package manaal_ventures.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity(name = "users")
public class UserEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false, length = 50, columnDefinition = "varchar(50) default ''")
    private String firstName;
    @Column(nullable = false, length = 50, columnDefinition = "varchar(50) default ''")
    private String lastName;
    @Column(nullable = false, length = 120, columnDefinition = "varchar(50) default ''")
    private String email;

    @Column(nullable = false, length = 20, columnDefinition = "varchar(50) default ''")
    private String phoneNumber;
    @Column(nullable = false, length = 50, columnDefinition = "Date default '1990-01-01'")
    private java.sql.Date dateOfBirth;

    @Column(nullable = false, length = 50, columnDefinition = "varchar(50) default ''")
    private String country;

    @Column(nullable = false, length = 50, columnDefinition = "varchar(50) default ''")
    private String emailVerificationToken, encryptedPassword;

    @Column(nullable = false, columnDefinition = "bit default 0")
    private Boolean emailVerificationStatus;

    @Column(nullable = false, columnDefinition = "bit default 1")
    private Boolean isActive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public java.sql.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(java.sql.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }

    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {


        this.emailVerificationStatus = emailVerificationStatus;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
