package com.zsx.sgs.core.figure;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 3血白板人物。所有初始3血人物继承了这个类
 */
@Component
public class The3WhiteboardCharacter {
    /**
     * 初始化血量
     */
    int HP = 3;
    /**
     * 初始化攻击距离
     */
    int range = 1;
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}