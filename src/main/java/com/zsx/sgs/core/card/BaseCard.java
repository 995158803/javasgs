package com.zsx.sgs.core.card;

import com.zsx.sgs.core.figure.ICommonFigure;

public class BaseCard {
    /**
     * 表示装备牌的槽位（1,2,3,4）
     */
    public int slot = 0;
    /**
     * 状态（在牌堆0，在手牌1,在装备牌中2）
     */
    public int status = 0;
    /**
     * 花色()  0表示未初始化
     */
    public int designColor = 0;

    public int getDesignColor() {
        return designColor;
    }

    public void setDesignColor(int designColor) {
        this.designColor = designColor;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 特效技能 (参数为人物的行为)
     */
    public void SpecialSkills(ICommonFigure iCommonFigure){

    };
}