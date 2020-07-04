package cn.edu.jxust.controller;

import cn.edu.jxust.entity.TKeyPro;
import cn.edu.jxust.service.TKeyProService;
import cn.edu.jxust.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.UUID;

/**
 * (TKeyPro)表控制层
 *
 * @author makejava
 * @since 2020-06-28 15:58:22
 */
@Controller
@RequestMapping("/record")
public class TKeyProController {
    /**
     * 服务对象
     */
    @Autowired
    private TKeyProService tKeyProService;

    /**
     * 通过主键查询单条数据
     *
     *
     * @return 单条数据
     */
/*    @GetMapping("selectOne")
    public TKeyPro selectOne(String id) {
        return this.tKeyProService.queryById(id);
    }*/

    @RequestMapping("/record_ui")
    public String  record_ui(Model model){
       TKeyPro kepro =new TKeyPro();

        int  allrecords=  tKeyProService.allRecords(); //所以记录条数 生成 LJIP001 002
        String  prefix ="LJIP";
        String a = UUIDUtil.getNext(allrecords,prefix);
       kepro.setKId(a);

        tKeyProService.addOneRecod(kepro);
         model.addAttribute("k_id",a);
        return  "record/record";
    }

}