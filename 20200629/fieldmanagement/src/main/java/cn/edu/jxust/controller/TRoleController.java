package cn.edu.jxust.controller;

import cn.edu.jxust.entity.TRole;
import cn.edu.jxust.service.TRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TRole)表控制层
 *
 * @author makejava
 * @since 2020-06-28 15:58:02
 */
@Controller
public class TRoleController {
    /**
     * 服务对象
     */
    @Autowired
    private TRoleService tRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
/*    @GetMapping("selectOne")
    public TRole selectOne(String id) {
        return this.tRoleService.queryById(id);
    }*/

}