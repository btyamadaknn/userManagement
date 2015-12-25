/**
 * 
 */
package userManagement.app.userManagement;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author terafw0684
 *
 */
public class UserManagementForm implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Pattern(regexp = "[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")
    private String userId;
    
    @Size(min = 1, max = 20)
    private String name;
    
    @Min(0)
    @Max(999)
    private int age;
    
    @NotNull
    private String jobCode;
    
    @NotNull
    private String gender;
    
    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @return the jobCode
     */
    public String getJobCode() {
        return jobCode;
    }
    /**
     * @param jobCode the jobCode to set
     */
    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
