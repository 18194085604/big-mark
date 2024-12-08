package com.gjy.domain.strategy.service.rule.filter;

import com.gjy.domain.strategy.model.entity.RuleActionEntity;
import com.gjy.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @description 抽奖规则过滤接口
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {
    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}
