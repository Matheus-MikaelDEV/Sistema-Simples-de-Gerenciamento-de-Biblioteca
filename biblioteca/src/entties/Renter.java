package entties;

public class Renter {
    private String name;
    private String email;
    private String phone;
    private Integer codeBookRanted;

    public Renter(String name, String email, String phone, Integer codeBookRanted) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.codeBookRanted = codeBookRanted;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getCodeBookRanted() {
        return codeBookRanted;
    }
}
