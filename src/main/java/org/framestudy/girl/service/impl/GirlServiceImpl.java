package org.framestudy.girl.service.impl;

import org.framestudy.girl.dao.GirlDao;
import org.framestudy.girl.entity.GirlDO;
import org.framestudy.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: peng
 * Description:
 * Date: Created in 2018/2/1 下午5:46
 * Modified By:
 */
@Service
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlDao girlDao;

    @Override
    public void saveGirl(GirlDO girl) {
        girlDao.save(girl);
    }

    @Override
    public List<GirlDO> findGirlsByPage() {
        return null;
    }

    @Override
    public GirlDO findGirlById(String id) {
        return girlDao.findOne(id);
    }
}
