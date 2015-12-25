/**
 * 
 */
package userManagement.domain.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author terafw0684
 *
 */
public class UserInfoBySearchCriteria implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;
    private String name;
    private int age;
    private String jobCode;
    private String gender;
    private String version;
    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }
    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }
    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    private List<RelationshipInfo> relationshipInfo;
    
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
    /**
     * @return the relationshipInfo
     */
    public List<RelationshipInfo> getRelationshipInfo() {
        return relationshipInfo;
    }
    /**
     * @param relationshipInfo the relationshipInfo to set
     */
    public void setRelationshipInfo(List<RelationshipInfo> relationshipInfo) {
        this.relationshipInfo = relationshipInfo;
    }
    
}
