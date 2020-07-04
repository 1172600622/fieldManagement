package cn.edu.jxust.impl;

import cn.edu.jxust.entity.TKeyPro;
import cn.edu.jxust.dao.TKeyProDao;
import cn.edu.jxust.service.TKeyProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TKeyPro)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 15:58:22
 */
@Service()
public class TKeyProServiceImpl implements TKeyProService {
    @Autowired
    private TKeyProDao tKeyProDao;

    /**
     * 通过ID查询单条数据
     *
     * @param kId 主键
     * @return 实例对象
     */
    @Override
    public TKeyPro queryById(String kId) {
        return this.tKeyProDao.queryById(kId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TKeyPro> queryAllByLimit(int offset, int limit) {
        return this.tKeyProDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tKeyPro 实例对象
     * @return 实例对象
     */
    @Override
    public TKeyPro insert(TKeyPro tKeyPro) {
        this.tKeyProDao.insert(tKeyPro);
        return tKeyPro;
    }

    /**
     * 修改数据
     *
     * @param tKeyPro 实例对象
     * @return 实例对象
     */
    @Override
    public TKeyPro update(TKeyPro tKeyPro) {
        this.tKeyProDao.update(tKeyPro);
        return this.queryById(tKeyPro.getKId());
    }

    /**
     * 通过主键删除数据
     *
     * @param kId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String kId) {
        return this.tKeyProDao.deleteById(kId) > 0;
    }

    @Override
    public int allRecords() {

        return  tKeyProDao.allRecords();
    }

    @Override
    public void addOneRecod(String a) {

    }
//废弃
  /*  @Override
    public void addOneRecod(String a) {
        tKeyProDao.addOneRecod(a);
    }*/

    @Override
    public void addOneRecod(TKeyPro kepro) {
        tKeyProDao.addOneRecod(kepro);
    }
}