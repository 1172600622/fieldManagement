package cn.edu.jxust.service;

import cn.edu.jxust.entity.TDep;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (TDep)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */

public interface TDepService {

    /**
     * 通过ID查询单条数据
     *
     * @param depId 主键
     * @return 实例对象
     */
    TDep queryById(String depId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TDep> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tDep 实例对象
     * @return 实例对象
     */
    TDep insert(TDep tDep);

    /**
     * 修改数据
     *
     * @param tDep 实例对象
     * @return 实例对象
     */
    TDep update(TDep tDep);

    /**
     * 通过主键删除数据
     *
     * @param depId 主键
     * @return 是否成功
     */
    boolean deleteById(String depId);

    List<TDep> listAll();
}