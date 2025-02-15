package com.gjy.domain.activity.service.quote.rule;

public interface IActionChainArmory {
    IActionChain next();

    IActionChain appendNext(IActionChain next);
}
