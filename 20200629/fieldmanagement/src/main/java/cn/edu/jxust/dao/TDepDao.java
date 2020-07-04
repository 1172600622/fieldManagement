package cn.edu.jxust.dao;

import cn.edu.jxust.entity.TDep;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TDep)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */
public interface TDepDao {

    /**
     * 通过ID查询单条数据
     *
     * @param depId 主键
     * @return 实例对象
     */
    TDep queryById(String depId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TDep> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tDep 实例对象
     * @return 对象列表
     */
    List<TDep> queryAll(TDep tDep);

    /**
     * 新增数据
     *
     * @param tDep 实例对象
     * @return 影响行数
     */
    int insert(TDep tDep);

    /**
     * 修改数据
     *
     * @param tDep 实例对象
     * @return 影响行数
     */
    int update(TDep tDep);

    /**
     * 通过主键删除数据
     *
     * @param depId 主键
     * @return 影响行数
     */
    int deleteById(String depId);

    List<TDep> listAll();
}