package cn.edu.jxust.controller;

import cn.edu.jxust.entity.TAdmin;
import cn.edu.jxust.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/admin")
@SessionAttributes(value={"admin"})
public class TAdminController {
    @RequestMapping("/useradd")
    public String addUserUI( ) {
        System.out.println("跳转到用户界面");

        return "user/user-add";
    }
    @Autowired
    private TAdminService tAdminService;

    @RequestMapping("/login")
    public String doLogin() {
        return "admin-login";
    }
//登录校验

    @RequestMapping("/login_check")
    public String checkAdmin(String  name,String pwd ,Model model) {
        System.out.println(name +" admin "+  pwd);
        TAdmin  admin = new TAdmin();
        admin.setAdmin_pwd(pwd);
        admin.setAdmin_name(name);
        admin=   tAdminService.checkAdmin(admin);
      model.addAttribute("admin",admin);
        return "index";
    }
    //跳转到添加用户界面




}
