/**
 * 
 */
package userManagement.domain.service.userManagement;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import userManagement.domain.model.User;
import userManagement.domain.model.UserInfoBySearchCriteria;

/**
 * @author terafw0684
 *
 */
public interface UserManagementService {

    User getUser(String userId);
    List<User> findUser(String userId, String name, int age,
            String jobCode, String gender);
    
    public Page<User> searchUser(UserInfoBySearchCriteria criteria, Pageable pageable);
}
