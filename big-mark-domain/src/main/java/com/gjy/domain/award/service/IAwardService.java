package com.gjy.domain.award.service;

import com.gjy.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @description 奖品服务接口
 */
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

}
