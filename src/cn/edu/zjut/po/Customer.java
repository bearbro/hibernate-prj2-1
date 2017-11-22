package cn.edu.zjut.po;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
public class Customer {
    private int customerId;
    private String account;
    private String password;
    private String name;
    private Byte sex;
    private Date birthday;
    private ContactInfo contactInfo;

    public Customer() {
        contactInfo=new ContactInfo();
    }

    public Customer(int customerId) {
        this.customerId = customerId;
        contactInfo=new ContactInfo();
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getPhone() {
        return contactInfo.getPhone();
    }

    public void setPhone(String phone) {
        contactInfo.setPhone(phone);
    }


    public String getEmail() {
        return contactInfo.getEmail();
    }

    public void setEmail(String email) {
        contactInfo.setEmail(email);
    }


    public String getAddress() {
        return contactInfo.getAddress();
    }

    public void setAddress(String address) {
        contactInfo.setAddress(address);
    }

    public String getZipcode() {
        return contactInfo.getZipcode();
    }

    public void setZipcode(String zipcode) {
        contactInfo.setZipcode(zipcode);
    }


    public String getFax() {
        return contactInfo.getFax();
    }

    public void setFax(String fax) {
        contactInfo.setFax(fax);
    }

}
