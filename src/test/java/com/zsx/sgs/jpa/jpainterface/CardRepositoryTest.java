package com.zsx.sgs.jpa.jpainterface;

import com.zsx.sgs.jpa.entity.Card;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CardRepositoryTest {
    @Autowired
    private CardRepository cardRepository;
//    @Autowired
//    private Equip equip;

    /**
     * 测试jpa保存装备code方法
     */
    @Test
    public void saveTest() {
        Card equip = new Card();
        equip.setName("桃园结义");
        equip.setCode(29);
        cardRepository.save(equip);
    }

    /**
     * 根据名称查询
     */
    @Test
    public void fingByName() {
        int hbj = cardRepository.withName("寒冰箭");
        System.out.println(hbj);
    }

    /**
     * 根据code查询
     */
    @Test
    public void fingByCode() {
        String s = cardRepository.withCode(8);
        System.out.println(s);
    }

}