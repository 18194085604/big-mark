package com.gjy.domain.activity.service.rule;

public interface IActionChainArmory {
    IActionChain next();

    IActionChain appendNext(IActionChain next);
}
