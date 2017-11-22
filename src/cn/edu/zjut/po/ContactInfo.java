package cn.edu.zjut.po;

public class ContactInfo {
    private String phone;
    private String email;
    private String address;
    private String zipcode;
    private String fax;

    public ContactInfo(String phone, String email, String address, String zipcode, String fax) {
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.zipcode = zipcode;
        this.fax = fax;
    }

    public ContactInfo() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactInfo that = (ContactInfo) o;

        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = phone != null ? phone.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        return result;
    }
}
