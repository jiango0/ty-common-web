package com.toonyoo.web.sequence.service.impl;

import com.toonyoo.common.ecodegenerator.scan.EcodeGenerator;
import com.toonyoo.web.sequence.service.EcodeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
public class EcodeGeneratorServiceImpl implements EcodeGeneratorService {

    @Autowired
    EcodeGenerator ecodeGeneratorServcie;

    @PostConstruct
    private void init() {
        ecodeGeneratorServcie.initEcodeGenerator("jzc", 1l, 999999l, 10000l);
    }

    @Transactional
    public String getCode(String name, String codePattern) {
        return ecodeGeneratorServcie.getCode(name, codePattern);
    }

}
