package com.zsx.sgs.jpa.jpainterface;

import com.zsx.sgs.jpa.entity.Figure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import javax.persistence.NamedQuery;
@Component
public interface FigureRepository extends JpaRepository<Figure,Integer>{
    @Query("select f.code from Figure f where f.name = :name")
        int withName(@Param("name") String name);
    @Query("select f.name from Figure f where f.code = :code")
        String withCode(@Param("code") int code);
}