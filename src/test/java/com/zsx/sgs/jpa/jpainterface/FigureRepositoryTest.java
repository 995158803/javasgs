package com.zsx.sgs.jpa.jpainterface;

import com.zsx.sgs.jpa.entity.Figure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FigureRepositoryTest {
    @Autowired
    FigureRepository figureRepository;

    /**
     * 测试jpa保存人物code方法
     */
    @Test
    public void saveJpa() {
    Figure figure = new Figure();
        System.out.println(figure);
        figure.setName("曹操1");
        figure.setCode(134);
        figureRepository.save(figure);
    }

    /**
     * 根据人物名查询code
     */
    @Test
    public void fingByName(){
        int  mc= figureRepository.withName("刘备");
        System.out.println(mc);
    }

    /**
     * 根据code查询人物名
     *
     */
    @Test
    public void findByCode(){
        String name = figureRepository.withCode(3);
        System.out.println(name);
    }
}