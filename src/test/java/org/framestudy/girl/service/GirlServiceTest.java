package org.framestudy.girl.service;

import org.framestudy.girl.entity.GirlDO;
import org.framestudy.girl.utils.Identities;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Author: peng
 * Description:
 * Date: Created in 2018/2/1 下午5:51
 * Modified By:
 */
public class GirlServiceTest extends AppTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void saveGirl() {
        GirlDO girl = new GirlDO();
        girl.setId(Identities.uuid());
        girl.setAge(22);
        girl.setCupSize("D");
        girl.setHeight(new BigDecimal("165"));
        girl.setName("何宝宝");
        girlService.saveGirl(girl);
    }

    @Test
    public void findGirlsByPage() {

    }

    @Test
    public void findGirlById() {
        GirlDO girl = girlService.findGirlById("a6b06de7713a4074a01d6f8715e1e511");
        System.out.println(girl);
    }
}