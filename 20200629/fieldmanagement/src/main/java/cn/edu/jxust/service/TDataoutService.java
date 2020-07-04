package cn.edu.jxust.service;

import cn.edu.jxust.entity.TDataout;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (TDataout)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */

public interface TDataoutService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TDataout queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TDataout> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tDataout 实例对象
     * @return 实例对象
     */
    TDataout insert(TDataout tDataout);

    /**
     * 修改数据
     *
     * @param tDataout 实例对象
     * @return 实例对象
     */
    TDataout update(TDataout tDataout);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}