package com.gjy.test.infrastructure;

import com.alibaba.fastjson.JSON;
import com.gjy.domain.strategy.service.IStrategyArmory;
import com.gjy.domain.strategy.service.IStrategyDispatch;
import com.gjy.infrastructure.persistent.dao.IAwardDao;
import com.gjy.infrastructure.persistent.po.Award;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description 奖品持久化单元测试
 * @create 2023-12-16 13:36
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;
    @Resource
    private IStrategyDispatch strategyArmory;

    @Test
    public void test_queryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        log.info("测试结果：{}", JSON.toJSONString(awards));
    }

    /**
     * 从装配的策略中随机获取奖品ID值
     */
    @Test
    public void test_getAssembleRandomVal() {
        log.info("测试结果：{} - 奖品ID值", strategyArmory.getRandomAwardId(100002L));
    }
}
