package cn.edu.jxust.impl;

import cn.edu.jxust.dao.OutWorkDao;
import cn.edu.jxust.entity.LJIP;
import cn.edu.jxust.service.OutWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class OutWorkServiceImpl implements OutWorkService {
    @Autowired
    OutWorkDao outWorkDao;
    @Override
    public void insert(LJIP ljip) {
            outWorkDao.insert(ljip);
    }
}
