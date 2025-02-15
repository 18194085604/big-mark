package com.gjy.domain.activity.service.quote.rule;

import com.gjy.domain.activity.model.entity.ActivityCountEntity;
import com.gjy.domain.activity.model.entity.ActivityEntity;
import com.gjy.domain.activity.model.entity.ActivitySkuEntity;

public interface IActionChain extends IActionChainArmory{
    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);

}
