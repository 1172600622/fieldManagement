package cn.edu.jxust.impl;

import cn.edu.jxust.entity.TRole;
import cn.edu.jxust.dao.TRoleDao;
import cn.edu.jxust.service.TRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TRole)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 15:58:02
 */
@Service()
public class TRoleServiceImpl implements TRoleService {
    @Autowired
    private TRoleDao tRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    @Override
    public TRole queryById(String roleId) {
        return this.tRoleDao.queryById(roleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TRole> queryAllByLimit(int offset, int limit) {
        return this.tRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    @Override
    public TRole insert(TRole tRole) {
        this.tRoleDao.insert(tRole);
        return tRole;
    }

    /**
     * 修改数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    @Override
    public TRole update(TRole tRole) {
        this.tRoleDao.update(tRole);
        return this.queryById(tRole.getRoleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String roleId) {
        return this.tRoleDao.deleteById(roleId) > 0;
    }
}