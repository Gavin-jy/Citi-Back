package com.example.eurekaservicesupport.dao;


import com.example.eurekaservicesupport.entity.SalesPerson;

public interface SalesPersonMapper {
    int deleteByPrimaryKey(Integer salesPersonId);

    int insert(SalesPerson row);

    int insertSelective(SalesPerson row);

    SalesPerson selectByPrimaryKey(Integer salesPersonId);

    int updateByPrimaryKeySelective(SalesPerson row);

    int updateByPrimaryKey(SalesPerson row);
}