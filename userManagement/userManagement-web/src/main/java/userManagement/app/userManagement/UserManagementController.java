package userManagement.app.userManagement;

import java.util.List;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import userManagement.domain.model.User;
import userManagement.domain.model.UserInfoBySearchCriteria;
import userManagement.domain.service.userManagement.UserManagementService;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes(value = {"Map<String,String>"})
public class UserManagementController {
    
    @Inject
    UserManagementService userManagementService;
    
    @Inject
    Mapper beanMapper;
    
    @ModelAttribute(value="userManagementForm")
    public UserManagementForm setupForm(){
        UserManagementForm form = new UserManagementForm();
        return form;
    }
    
    @RequestMapping(value = "/searchForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String search(Model model){
        
        return "userSearch/userSearch";
    }
    
    @RequestMapping(value="download",method = {RequestMethod.GET, RequestMethod.POST})
    public String download(String name,Model model){
        return "downloadView";
    }
    
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
    
    
   @RequestMapping(value = "/searchResult", method = {RequestMethod.GET, RequestMethod.POST})
   public String list(@Validated UserManagementForm form,BindingResult result,
           Pageable pageable, Model model){
      /* if(result.hasErrors()){
           return "userSearch/userSearch";
       */
       List<User> userList = null;
       userList = userManagementService.findUser(form.getUserId(),form.getName(),form.getAge(),
               form.getJobCode(),form.getGender());
       model.addAttribute("user",userList);       
       
       UserInfoBySearchCriteria criteria = beanMapper.map(form, UserInfoBySearchCriteria.class);
       Page<User> page = userManagementService.searchUser(criteria, pageable);
       model.addAttribute("page",page);
       
       return "userSearch/searchResult2";
   }
   
   /*
   @RequestMapping(value = "/searchResult", method = {RequestMethod.GET, RequestMethod.POST})
   public String searchResult(@Validated UserManagementForm form, BindingResult result,Model model){
       if(result.hasErrors()){
           return "userSearch/userSearch";
       }
       List<User> userList = null;
       userList = userManagementService.findUser(form.getUserId(),form.getName(),form.getAge(),
               form.getJobCode(),form.getGender());
       model.addAttribute("user",userList);
       model.addAttribute("size",userList.size());
       
       return "userSearch/searchResult";
   }*/
    
}
