package cn.edu.jxust.impl;

import cn.edu.jxust.entity.TDataout;
import cn.edu.jxust.dao.TDataoutDao;
import cn.edu.jxust.service.TDataoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TDataout)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */
@Service()
public class TDataoutServiceImpl implements TDataoutService {
    @Autowired
    private TDataoutDao tDataoutDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TDataout queryById(String id) {
        return this.tDataoutDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TDataout> queryAllByLimit(int offset, int limit) {
        return this.tDataoutDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tDataout 实例对象
     * @return 实例对象
     */
    @Override
    public TDataout insert(TDataout tDataout) {
        this.tDataoutDao.insert(tDataout);
        return tDataout;
    }

    /**
     * 修改数据
     *
     * @param tDataout 实例对象
     * @return 实例对象
     */
    @Override
    public TDataout update(TDataout tDataout) {
        this.tDataoutDao.update(tDataout);
        return this.queryById(tDataout.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tDataoutDao.deleteById(id) > 0;
    }
}