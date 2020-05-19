package me.fsd.ass.mod.entity;



import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;


    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Positive(message = "Contact Number should be positive value")
    @Column(name = "contact_number")
    private Long contactNumber;

    @Column(name = "reg_code")
    private String regCode = "";

    @Column(name = "role")
    private String role;

    @Column(name = "linkedin_url")
    private String linkedinUrl;

    @Column(name = "years_of_experience")
    private Float yearsOfExperience;

    @Column(name = "active")
    private Boolean active = false;

    @Column(name = "confirmed_sign_up")
    private Boolean confirmedSignUp = false;

    @Column(name = "reset_password")
    private Boolean resetPassword = false;

    @Column(name = "reset_password_date")
    private Date resetPasswrodDate;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User() {
    }

    public User(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.password = user.getPassword();
        this.active = user.getActive();
        this.roles = user.getRoles();
    }


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public void setYearsOfExperience(Float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setConfirmedSignUp(Boolean confirmedSignUp) {
        this.confirmedSignUp = confirmedSignUp;
    }

    public void setResetPassword(Boolean resetPassword) {
        this.resetPassword = resetPassword;
    }

    public void setResetPasswrodDate(Date resetPasswrodDate) {
        this.resetPasswrodDate = resetPasswrodDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getActive() {
        return active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }
}
