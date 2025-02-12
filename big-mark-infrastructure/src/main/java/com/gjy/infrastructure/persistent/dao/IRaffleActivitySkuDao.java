package com.gjy.infrastructure.persistent.dao;

import com.gjy.infrastructure.persistent.po.RaffleActivitySku;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRaffleActivitySkuDao {

    RaffleActivitySku queryActivitySku(Long sku);

    void clearActivitySkuStock(Long sku);

    void updateActivitySkuStock(Long sku);
}
