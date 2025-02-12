package com.gjy.domain.activity.respositiory;

import com.gjy.domain.activity.model.aggregate.CreateOrderAggregate;
import com.gjy.domain.activity.model.entity.ActivityCountEntity;
import com.gjy.domain.activity.model.entity.ActivityEntity;
import com.gjy.domain.activity.model.entity.ActivitySkuEntity;
import com.gjy.domain.activity.model.valobj.ActivitySkuStockKeyVO;

import java.util.Date;

/**
 * @description 活动仓储接口
 */
public interface IActivityRepository {

    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

    void doSaveOrder(CreateOrderAggregate createOrderAggregate);

    boolean subtractionActivitySkuStock(Long sku, String cacheKey, Date endDateTime);

    ActivitySkuStockKeyVO takeQueueValue();

    void clearQueueValue();

    void updateActivitySkuStock(Long sku);

    void clearActivitySkuStock(Long sku);

    void activitySkuStockConsumeSendQueue(ActivitySkuStockKeyVO build);

    void cacheActivitySkuStockCount(String cacheKey, Integer stockCount);
}
