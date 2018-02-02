package org.framestudy.girl.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Author: peng
 * Description:
 * Date: Created in 2018/2/1 下午5:11
 * Modified By:
 */
@Getter
@Setter
@ToString
@Entity
@Table(name="girl_info")
public class GirlDO {

    public GirlDO() {
    }

    @Id
    private String id;

    private String name;

    private String cupSize;

    private Integer age;

    private BigDecimal height;

}
