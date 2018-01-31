package org.framestudy.girl.controller;

import org.framestudy.girl.config.GirlProperties;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: xiangshaopeng
 * Description:
 * Date: Created in 2018/1/5 下午1:51
 * Modified By:
 */

@RestController
public class GirlController {

    @Resource
    private GirlProperties girlProperties;

    @RequestMapping(value = "/properties",method = RequestMethod.GET)
    public String girl(){
        return "cupSize:" + girlProperties.getCupSize() + ",age:" + girlProperties.getAge()
                + ",height:" + girlProperties.getHeight();
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello SpringBoot!";
    }

}
