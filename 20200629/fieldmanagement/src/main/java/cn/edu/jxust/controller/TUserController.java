package cn.edu.jxust.controller;

import cn.edu.jxust.entity.TUser;
import cn.edu.jxust.service.TUserService;
import cn.edu.jxust.utils.UUIDUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2020-06-28 13:05:52
 */
@Controller
@RequestMapping("/user")
@SessionAttributes(value={"user"})
public class TUserController {
    @InitBinder
    public void init(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
    /**
     * 服务对象
     */
    @Autowired
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param
     * @return 单条数据
     */
/*    @GetMapping("selectOne")
    public TUser selectOne(String id) {
        return this.tUserService.queryById(id);
    }*/
   /* @RequestMapping("ssm.html")
    public String test() {

        TUser tUser = tUserService.queryById("1");
        System.out.println(tUser);
        return "admin-login";
    }*/

    /* @RequestMapping("/admin/do/login.html")
     public String doLogin(@RequestParam(value = "loginAcct",required = false) String loginAcct, @RequestParam(value = "userpswd",required = false) String userpswd,
                                 HttpSession session) {

       *//*  Admin admin = adminService.getAdminByLoginAcct(loginAcct, userpswd);

        session.setAttribute(CrowdConstant.ATTR_NAME_LOGIN_ADMIN, admin);*//*
      //  tUserService.getUserByLoginacct(loginAcct, userpswd);
        System.out.println("1111111111111111");
        return "admin-main";


    }*/

    @RequestMapping("/login")
    public String loginUI() {
        return "/user/user-login";
    }
/*添加新用户*/
    @RequestMapping("/insert")
    public ModelAndView addUser(TUser tUser) {

        System.out.println("user "+tUser);

        System.out.println(tUser);
               tUser.setId(UUIDUtil.getUUID());

                tUserService.insert(tUser);

        return new ModelAndView("redirect:listall");
    }
    @RequestMapping("/dologin")
    public String login(String username, String password, Model  model) {

        System.out.println("userName" +username +"password" +password);
        TUser user = new TUser();
        user.setUserName(username);
        user.setPassword(password);

        System.out.println("user  controller"+username);

        user = tUserService.checkUser(user);

          model.addAttribute("user",user);
        return "/user/user-index";
    }
    @RequestMapping("/listall")
    public String listall(Model  model) {

       List<TUser> list = tUserService.listall();
        model.addAttribute("lists",list);
            return  "/user/user-list";
    }
}