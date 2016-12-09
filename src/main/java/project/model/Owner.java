package project.model;

import javax.persistence.*;

/**
 * Created by Наиль on 10.11.2016.
 */
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    /*@OneToMany(mappedBy = "owner")
    private List<Request> requestList;*/

    public Owner(){

    }

    public Owner(String firstName, String lastName, String address, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Owner:{ " +
                "name = " + firstName + "| " +
                "lastname = " + lastName + "| " +
                "address = " + address + "| " +
                "phone number = " + phoneNumber + "}";
    }

    public Long getId() {
        return id;
    }
}
