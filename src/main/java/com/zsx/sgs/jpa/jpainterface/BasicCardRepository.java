package com.zsx.sgs.jpa.jpainterface;

import com.zsx.sgs.jpa.entity.BasicCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BasicCardRepository  extends JpaRepository<BasicCard,Integer> {
    @Query("select b from BasicCard b where b.code = :code")
    BasicCard withCode(@Param("code") int code);
}