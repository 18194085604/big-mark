package com.gjy.domain.strategy.service.rule.chain;

public interface ILogicChain extends ILogicChainArmory {
    Integer logic(String userId, Long strategyId);
}
