package manaal_ventures.com.model.request;

public class UserRequestModel {
    private String firstName, lastName, email, password, phoneNumber, dateOfBirth, countryCode;


    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        return this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String setPhoneNumber(String phoneNumber) {
        return this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {

        return dateOfBirth;
    }

    public String setDateOfBirth(String dateOfBirth) {
        return this.dateOfBirth = dateOfBirth;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String setCountryCode(String countryCode) {
        return this.countryCode = countryCode;
    }

}
