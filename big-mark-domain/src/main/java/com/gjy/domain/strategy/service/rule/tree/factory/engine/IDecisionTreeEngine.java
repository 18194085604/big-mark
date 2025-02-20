package com.gjy.domain.strategy.service.rule.tree.factory.engine;

import com.gjy.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @description 规则树组合接口
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId);

}
