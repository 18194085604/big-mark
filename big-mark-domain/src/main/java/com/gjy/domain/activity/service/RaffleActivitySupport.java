package com.gjy.domain.activity.service;

import com.gjy.domain.activity.model.entity.ActivityCountEntity;
import com.gjy.domain.activity.model.entity.ActivityEntity;
import com.gjy.domain.activity.model.entity.ActivitySkuEntity;
import com.gjy.domain.activity.respositiory.IActivityRepository;
import com.gjy.domain.activity.service.rule.factory.DefaultActivityChainFactory;

/**
 * @description 抽奖活动的支撑类
 */
public class RaffleActivitySupport {

    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivitySupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }

    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }

    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }

    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }

}
