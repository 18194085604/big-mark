package com.gjy.domain.strategy.service.rule.tree.factory;

import com.gjy.domain.strategy.model.entity.StrategyEntity;
import com.gjy.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import com.gjy.domain.strategy.model.valobj.RuleTreeVO;
import com.gjy.domain.strategy.repository.IStrategyRepository;
import com.gjy.domain.strategy.service.rule.chain.ILogicChain;
import com.gjy.domain.strategy.service.rule.tree.ILogicTreeNode;
import com.gjy.domain.strategy.service.rule.tree.factory.engine.IDecisionTreeEngine;
import com.gjy.domain.strategy.service.rule.tree.factory.engine.impl.DecisionTreeEngine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DefaultTreeFactory {
    private final Map<String, ILogicTreeNode> logicTreeNodeGroup;


    public DefaultTreeFactory(Map<String, ILogicTreeNode> logicTreeNodeGroup) {
        this.logicTreeNodeGroup = logicTreeNodeGroup;
    }

    public IDecisionTreeEngine openLogicTree(RuleTreeVO ruleTreeVO) {
        return new DecisionTreeEngine(logicTreeNodeGroup, ruleTreeVO);
    }


    /**
     * 决策树个动作实习
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TreeActionEntity {
        private RuleLogicCheckTypeVO ruleLogicCheckType;
        private StrategyAwardVO strategyAwardData;
    }


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StrategyAwardVO {
        /** 抽奖奖品ID - 内部流转使用 */
        private Integer awardId;
        /** 抽奖奖品规则 */
        private String awardRuleValue;
    }



}