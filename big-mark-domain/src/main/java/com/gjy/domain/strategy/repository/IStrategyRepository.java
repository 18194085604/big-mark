package com.gjy.domain.strategy.repository;

import com.gjy.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;
import java.util.Map;

public interface  IStrategyRepository {

    int getRateRange(Long strategyId);

    Integer getStrategyAwardAssemble(Long strategyId, Integer rateKey);

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(Long strategyId, int size, Map<Integer, Integer> shuffleStrategyAwardSearchRateTable);
}
