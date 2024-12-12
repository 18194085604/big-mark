package com.gjy.domain.strategy.service.rule.chain;

import com.gjy.domain.strategy.service.rule.chain.factroy.DefaultChainFactory;

public interface ILogicChain extends ILogicChainArmory {
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);
}
