package com.zsx.sgs.jpa.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 基础牌堆  一共106张
 * code
 * 300-499
 * 30杀 15闪 8药
 * 3决斗 2雷 4无懈 3牢 2借刀 2五谷 4无中 1休养 3烽火 1万剑 5探囊 6釜底
 * 2虎符 2玉如意 3防御马 3进攻马 1龙鳞刀 1盘龙棍 1鱼肠剑 1博浪锤 1狼牙棒 1霸王弓 1芦叶枪
 *
 */
@Component
@Entity
public class BasicCard {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private Integer code;
    /**
     * 花色
     */
    private Integer color;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}