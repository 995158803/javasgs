package com.zsx.sgs.jpa.jpainterface;

import com.zsx.sgs.jpa.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CardRepository extends JpaRepository<Card,Integer>{
    @Query("select c.code from Card c where c.name = :name")
    int withName(@Param("name") String name);
    @Query("select c.name from Card c where c.code = :code")
    String withCode(@Param("code") int code);
}