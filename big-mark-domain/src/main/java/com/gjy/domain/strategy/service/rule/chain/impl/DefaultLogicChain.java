package com.gjy.domain.strategy.service.rule.chain.impl;

import com.gjy.domain.strategy.service.armory.IStrategyDispatch;
import com.gjy.domain.strategy.service.rule.chain.AbstractLogicChain;
import com.gjy.domain.strategy.service.rule.chain.factroy.DefaultChainFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 默认的责任链「作为最后一个链」
 */
@Slf4j
@Component("default")
public class DefaultLogicChain extends AbstractLogicChain {
    @Resource
    protected IStrategyDispatch strategyDispatch;


    @Override
    protected String ruleModel() {
        return "default";
    }

    @Override
    public DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId) {
        Integer awardId = strategyDispatch.getRandomAwardId(strategyId);
        log.info("抽奖责任链-默认处理 userId: {} strategyId: {} ruleModel: {} awardId: {}", userId, strategyId, ruleModel(), awardId);
        return DefaultChainFactory.StrategyAwardVO.builder()
                .awardId(awardId)
                .logicModel(ruleModel())
                .build();
    }
}
