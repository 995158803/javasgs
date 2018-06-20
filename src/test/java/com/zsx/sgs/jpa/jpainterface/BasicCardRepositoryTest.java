package com.zsx.sgs.jpa.jpainterface;

import com.zsx.sgs.jpa.entity.BasicCard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicCardRepositoryTest {
    @Autowired
    BasicCardRepository basicCardRepository;

    /**
     * 测试jpa保存
     */
    @Test
    public void save(){
        for(int i=0;i<1;i++){
            BasicCard basicCard = new BasicCard();
            basicCard.setName("探囊取物");
            basicCard.setCode(405+i);
            basicCard.setColor(1);
             basicCardRepository.save(basicCard);
        }
    }
    @Test
    public void withName(){
        BasicCard basicCard = basicCardRepository.withCode(383);
        System.out.println(basicCard.getName());
    }
}