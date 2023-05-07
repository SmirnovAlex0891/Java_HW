package hw_21_04_2023;

class EmailAddress {
    private String email;

    public EmailAddress(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "email='" + email + '\'' +
                '}';
    }
}
