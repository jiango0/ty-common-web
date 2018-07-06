package com.toonyoo.web.sequence.controller;

import com.toonyoo.web.sequence.service.EcodeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ecode")
public class EcodeGeneratorController {

    @Autowired
    EcodeGeneratorService ecodeGeneratorService;

    @RequestMapping(value = "getCode")
    public String getCode(String codePattern) {
        return ecodeGeneratorService.getCode("jzc", codePattern);
    }

}
