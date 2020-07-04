package cn.edu.jxust.dao;

import cn.edu.jxust.entity.TDataout;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TDataout)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */
public interface TDataoutDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TDataout queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TDataout> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tDataout 实例对象
     * @return 对象列表
     */
    List<TDataout> queryAll(TDataout tDataout);

    /**
     * 新增数据
     *
     * @param tDataout 实例对象
     * @return 影响行数
     */
    int insert(TDataout tDataout);

    /**
     * 修改数据
     *
     * @param tDataout 实例对象
     * @return 影响行数
     */
    int update(TDataout tDataout);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}