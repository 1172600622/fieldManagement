package cn.edu.jxust.impl;

import cn.edu.jxust.entity.TUser;
import cn.edu.jxust.dao.TUserDao;
import cn.edu.jxust.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUser)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 13:05:52
 */
@Service()
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserDao tUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TUser queryById(String id) {
        return this.tUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUser> queryAllByLimit(int offset, int limit) {
        return this.tUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser insert(TUser tUser) {
        this.tUserDao.insert(tUser);
        return tUser;
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser update(TUser tUser) {
        this.tUserDao.update(tUser);
        return this.queryById(tUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tUserDao.deleteById(id) > 0;
    }

    @Override
    public TUser getUserByLoginacct(String loginAcct, String userpswd) {
        return null;
    }

    @Override
    public TUser checkUser(TUser user) {
        TUser use=  tUserDao.checkUser( user);
        System.out.println("user "+use);
        if(user!=null){
            return  use;
        }else {
            return null;
        }
    }

    @Override
    public List<TUser> listall() {

        return tUserDao.listAll();
    }
}