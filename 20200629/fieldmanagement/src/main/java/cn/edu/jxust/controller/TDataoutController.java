package cn.edu.jxust.controller;

import cn.edu.jxust.entity.TDataout;
import cn.edu.jxust.service.TDataoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import javax.annotation.Resource;

/**
 * (TDataout)表控制层
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */
@Controller
public class TDataoutController {
    /**
     * 服务对象
     */
    @Autowired
    private TDataoutService tDataoutService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
/*    @GetMapping("selectOne")
    public TDataout selectOne(String id) {
        return this.tDataoutService.queryById(id);
    }*/

}