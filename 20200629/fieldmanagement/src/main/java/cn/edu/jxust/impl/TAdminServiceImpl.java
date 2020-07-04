package cn.edu.jxust.impl;

import cn.edu.jxust.dao.TAdminDao;
import cn.edu.jxust.dao.TDataoutDao;
import cn.edu.jxust.entity.TAdmin;
import cn.edu.jxust.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class TAdminServiceImpl implements TAdminService {
    @Autowired
    private TAdminDao tAdminDao;
    @Override
    public TAdmin checkAdmin(TAdmin admin) {

        return tAdminDao.checkAdmin( admin);
    }
}
