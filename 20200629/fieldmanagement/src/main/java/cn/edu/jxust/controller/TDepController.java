package cn.edu.jxust.controller;

import cn.edu.jxust.entity.TDep;
import cn.edu.jxust.service.TDepService;
import cn.edu.jxust.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TDep)表控制层
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */
@RequestMapping("/dept")
@Controller
public class TDepController {
    /**
     * 服务对象
     */

    @Autowired
    private TDepService tDepService;

    /**
     * 通过主键查询单条数据
     *
     *
     * @return 单条数据
     */
  /*  @GetMapping("selectOne")
    public TDep selectOne(String id) {
        return this.tDepService.queryById(id);
    }*/
   /*跳转到添加页面*/
  @RequestMapping("/add")
    public  String toAdddept() {
      return  "/dept/dept-add";
     }

  /*添加部门*/
    @RequestMapping("/insert")
    public  String insert(TDep dept) {
        dept.setDepId(UUIDUtil.getUUID());
         tDepService.insert(dept);
        return  "/dept/dept-add";
    }

  /*  private String depId;

    private String name;

    private Boolean status;

    private String depTel;*/

   @RequestMapping("/listAll")
    public  String  listAll(Model model){

       List<TDep> list = tDepService.listAll();
       model.addAttribute("lists",list);
       return  "dept/dept-list";
   }

}