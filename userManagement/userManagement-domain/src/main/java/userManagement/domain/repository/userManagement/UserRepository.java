/**
 * 
 */
package userManagement.domain.repository.userManagement;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import userManagement.domain.model.User;
import userManagement.domain.model.UserInfoBySearchCriteria;

/**
 * @author terafw0684
 *
 */
public interface UserRepository {
    User findOne(String userId);
    List<User> findUser(@Param("userId") String userId,
            @Param("name") String name, @Param("age") int age, @Param("jobCode") String jobCode,
            @Param("gender") String gender);
    long countByCriteria(UserInfoBySearchCriteria criteria);
    List<User> findPageByCriteria(UserInfoBySearchCriteria criteria,
            RowBounds rowBounds);
}