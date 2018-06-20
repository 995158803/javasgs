package com.zsx.sgs.core.figure;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 所有人物都有的行为，所有人物都要实现这个类
 */
@Component
public interface ICommonFigure {
    /**
     * 掉血
     */
    void dropBlood();
    /**
     * 加血
     */
    void addBlood();
    /**
     * 装备武器
     */
    void upWeapon();
    /**
     * 卸下武器
     */
    void downWeapon();
    /**
     * 装备防具
     */
    void upArmor();
    /**
     * 卸下防具
     */
    void downArmor();
    /**
     * 装备进攻马
     */
    void upAttackHorse();
    /**
     * 卸下进攻马
     */
    void downAttackHorse();
    /**
     * 装备防御马
     */
    void updefenceHorse();
    /**
     * 卸下防御马
     */
    void downdefenceHorse();
    /**
     * 回合开始
     */
    void begin();
    /**
     * 回合结束
     */
    void end();
    /**
     * 摸牌
     */
    void inCard();
    /**
     * 出牌
     */
    void outCard();
    /**
     * 弃牌
     */
    void disCard();
    /**
     * 回合开始前判定
     */
    void beforeJudge();
    /**
     * 回合进行中判定
     */
    void currentJudge();
    /**
     * 回合结束后判定
     */
    void endJudge();
    /**
     * 死亡触发
     */
    void dead();

    /**
     * 国籍
     */
    void country();
    /**
     * 性别
     */
    void sex();
    /**
     * 语音
     */
    void voice();
    /**
     * 槽位信息(每个英雄有四个槽位)1是武器，2是防具，3是进攻马。4是防御马
     */
    void slots();
    /**
     * 是否还可以出杀
     */
    void theKill();
}