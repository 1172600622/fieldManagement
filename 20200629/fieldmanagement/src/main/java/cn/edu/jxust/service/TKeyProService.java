package cn.edu.jxust.service;

import cn.edu.jxust.entity.TKeyPro;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (TKeyPro)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 15:58:22
 */

public interface TKeyProService {

    /**
     * 通过ID查询单条数据
     *
     * @param kId 主键
     * @return 实例对象
     */
    TKeyPro queryById(String kId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TKeyPro> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tKeyPro 实例对象
     * @return 实例对象
     */
    TKeyPro insert(TKeyPro tKeyPro);

    /**
     * 修改数据
     *
     * @param tKeyPro 实例对象
     * @return 实例对象
     */
    TKeyPro update(TKeyPro tKeyPro);

    /**
     * 通过主键删除数据
     *
     * @param kId 主键
     * @return 是否成功
     */
    boolean deleteById(String kId);




    int allRecords();

    void addOneRecod(String a);

    void addOneRecod(TKeyPro kepro);
}