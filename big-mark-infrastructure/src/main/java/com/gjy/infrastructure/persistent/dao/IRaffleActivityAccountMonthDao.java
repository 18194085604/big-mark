package com.gjy.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import com.gjy.infrastructure.persistent.po.RaffleActivityAccountMonth;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description 抽奖活动账户表-月次数
 */
@Mapper
public interface IRaffleActivityAccountMonthDao {
    @DBRouter
    RaffleActivityAccountMonth queryActivityAccountMonthByUserId(RaffleActivityAccountMonth raffleActivityAccountMonthReq);

    int updateActivityAccountMonthSubtractionQuota(RaffleActivityAccountMonth build);

    void insertActivityAccountMonth(RaffleActivityAccountMonth build);
}
