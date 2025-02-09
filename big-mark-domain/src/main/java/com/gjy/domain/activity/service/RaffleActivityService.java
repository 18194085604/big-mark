package com.gjy.domain.activity.service;

import com.gjy.domain.activity.respositiory.IActivityRepository;
import org.springframework.stereotype.Service;

/**
 * 抽检活动服务
 */
@Service
public class RaffleActivityService extends AbstractRaffleActivity{
    public RaffleActivityService(IActivityRepository activityRepository) {
        super(activityRepository);
    }
}
