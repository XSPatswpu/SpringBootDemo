package org.framestudy.girl.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author: xiangshaopeng
 * Description:
 * Date: Created in 2018/1/5 下午3:31
 * Modified By:
 */
@ConfigurationProperties(prefix = "girl")
@Component
@Getter
@Setter
@ToString
public class GirlProperties {

    private String cupSize;

    private Integer age;

    private Integer height;

}
