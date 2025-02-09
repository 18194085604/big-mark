package com.gjy.domain.activity.respositiory;

import com.gjy.domain.activity.model.entity.ActivityCountEntity;
import com.gjy.domain.activity.model.entity.ActivityEntity;
import com.gjy.domain.activity.model.entity.ActivitySkuEntity;

/**
 * @description 活动仓储接口
 */
public interface IActivityRepository {

    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

}
