package cn.edu.jxust.service;

import cn.edu.jxust.entity.TUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (TUser)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 13:05:52
 */

public interface TUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TUser queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser update(TUser tUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    TUser getUserByLoginacct(String loginAcct, String userpswd);

    TUser checkUser(TUser user);

    List<TUser> listall();
}