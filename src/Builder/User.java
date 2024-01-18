package Builder;

public class User {
    protected static class UserBuilder{
        private String userName;
        private String firstName;
        private String lastName;
        private String mobileNumber;
        private String email;
        private String addressLine1;
        private String city;
        private String state;
        private String country;
        private String pincode;

        public UserBuilder(){
            this.userName = null;
            this.firstName = null;
            this.lastName = null;
            this.mobileNumber = null;
            this.email = null;
            this.addressLine1 = null;
            this.city = null;
            this.state = null;
            this.country = null;
            this.pincode = null;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public UserBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public UserBuilder setPincode(String pincode) {
            this.pincode = pincode;
            return this;
        }
        
        public User build(){
            return new User(userName,firstName,lastName,mobileNumber,email,addressLine1,city,state,country,pincode);
        }
    }



    private String userName;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String addressLine1;
    private String city;
    private String state;
    private String country;
    private String pincode;

    public User(String userName,
                String firstName,
                String lastName,
                String mobileNumber,
                String email,
                String addressLine1,
                String city,
                String state,
                String country,
                String pincode) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPincode() {
        return pincode;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
