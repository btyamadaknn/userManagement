/**
 * 
 */
package userManagement.app.userManagement;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.terasoluna.gfw.web.download.AbstractFileDownloadView;

import userManagement.domain.model.User;

/**
 * @author terafw0684
 *
 */
@Component
public class DownloadView extends AbstractFileDownloadView{
    
        
    @Override
    protected InputStream getInputStream(Map<String, Object> model,
            HttpServletRequest request) throws IOException {
        Resource resource = new ClassPathResource("");
        return resource.getInputStream();
    }

    @Override
    protected void addResponseHeader(Map<String, Object> model,
            HttpServletRequest request, HttpServletResponse response) {
        User user = new User();
        String name;
        name = (String)request.getParameter("name");
        response.setHeader("Content-Disposition",
                "attachment; filename="+ name +".csv");
        response.setContentType("text/csv");

    }
 }