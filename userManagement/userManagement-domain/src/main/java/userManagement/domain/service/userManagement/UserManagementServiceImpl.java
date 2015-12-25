/**
 * 
 */
package userManagement.domain.service.userManagement;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.codelist.CodeList;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;
import org.terasoluna.gfw.common.message.ResultMessages;

import userManagement.domain.model.User;
import userManagement.domain.model.UserInfoBySearchCriteria;
import userManagement.domain.repository.userManagement.UserRepository;

/**
 * @author terafw0684
 *
 */
@Transactional
@Service
public class UserManagementServiceImpl implements UserManagementService{
    
    @Inject
    @Named("CL_JOB")
    CodeList jobCodeList;
    
    @Inject
    UserRepository userRepository;
    
    @Transactional(readOnly = true)
    @Override
    public User getUser(String userId){
        User user = userRepository.findOne(userId);
        
        if(user == null){
            throw new ResourceNotFoundException(ResultMessages.error().add("info.UM.U1.0001"));
        }
        
        switch(user.getGender()){
            case "0":
                user.setGender("男");
                break;
            case "1":
                user.setGender("女");
                break;
        }
        
        user.setJobCode(jobCodeList.asMap().get(user.getJobCode()));
        
        String pos = user.getPostalCode();
        
        user.setPostalCode("〒" + pos.substring(0,3) + "-" + pos.substring(3,7));
        
        return user;
    }

    @Override
    public List<User> findUser(String userId, String name, int age,
            String jobCode, String gender) {
        List<User> userList = userRepository.findUser(userId, name, age, jobCode, gender);
        return userList;
    }
    
    @Transactional(readOnly = true)
    @Override
    public Page<User> searchUser(UserInfoBySearchCriteria criteria, Pageable pageable){
        long total = userRepository.countByCriteria(criteria);
        List<User> users;
        if(0 < total){
            RowBounds rowBounds = new RowBounds(pageable.getOffset(),
                pageable.getPageSize());
            users = userRepository.findPageByCriteria(criteria, rowBounds);
        }else{
            users = Collections.emptyList();
        }
        return new PageImpl<>(users, pageable, total);
    }
    
    /*
    public Page<User> searchUserInfo(SearchCriteria criteria, Pageable pageable){
        return null;
    }
    
    public void downloadUserInfo(UserInfoBySearchCriteria criteria, BufferedWriter downloadWriter){
        
    }
    
    public List<RelationshipInfo> relationshipFindByUserId(String userId){
        return null;
    }
    
    */
}
