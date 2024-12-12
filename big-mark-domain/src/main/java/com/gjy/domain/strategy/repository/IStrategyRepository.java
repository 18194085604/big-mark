package com.gjy.domain.strategy.repository;

import com.gjy.domain.strategy.model.entity.StrategyAwardEntity;
import com.gjy.domain.strategy.model.entity.StrategyEntity;
import com.gjy.domain.strategy.model.entity.StrategyRuleEntity;
import com.gjy.domain.strategy.model.valobj.RuleTreeVO;
import com.gjy.domain.strategy.model.valobj.StrategyAwardRuleModelVO;

import java.util.List;
import java.util.Map;

public interface  IStrategyRepository {

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    Integer getStrategyAwardAssemble(String key,  Integer rateKey);

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, int size, Map<Integer, Integer> shuffleStrategyAwardSearchRateTable);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleWeight);

    String queryStrategyRuleValue(Long strategyId, String ruleModel);


    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);

    RuleTreeVO queryRuleTreeVOByTreeId(String ruleModels);
}
