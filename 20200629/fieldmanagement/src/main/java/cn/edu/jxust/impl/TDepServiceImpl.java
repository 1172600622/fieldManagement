package cn.edu.jxust.impl;

import cn.edu.jxust.entity.TDep;
import cn.edu.jxust.dao.TDepDao;
import cn.edu.jxust.service.TDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TDep)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */
@Service()
public class TDepServiceImpl implements TDepService {
    @Autowired
    private TDepDao tDepDao;

    /**
     * 通过ID查询单条数据
     *
     * @param depId 主键
     * @return 实例对象
     */
    @Override
    public TDep queryById(String depId) {
        return this.tDepDao.queryById(depId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TDep> queryAllByLimit(int offset, int limit) {
        return this.tDepDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tDep 实例对象
     * @return 实例对象
     */
    @Override
    public TDep insert(TDep tDep) {
        this.tDepDao.insert(tDep);
        return tDep;
    }

    /**
     * 修改数据
     *
     * @param tDep 实例对象
     * @return 实例对象
     */
    @Override
    public TDep update(TDep tDep) {
        this.tDepDao.update(tDep);
        return this.queryById(tDep.getDepId());
    }

    /**
     * 通过主键删除数据
     *
     * @param depId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String depId) {
        return this.tDepDao.deleteById(depId) > 0;
    }

    @Override
    public List<TDep> listAll() {
        return tDepDao.listAll();
    }
}