package org.framestudy.girl.service;

import org.framestudy.girl.entity.GirlDO;

import java.util.List;

/**
 * Author: peng
 * Description:
 * Date: Created in 2018/2/1 下午4:36
 * Modified By:
 */
public interface GirlService {

    //新增、修改
    void saveGirl(GirlDO girl);

    //分页查询列表
    List<GirlDO> findGirlsByPage();

    //查询详情
    GirlDO findGirlById(String id);

}
