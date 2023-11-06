package com.fh.code.service.impl;

import com.fh.code.service.TestService;

/**
 * @author hp
 * @version 1.0
 * @date 2023/11/5
 */
public class TestServiceImpl implements TestService {
    @Override
    public void getName(String code) {
        System.out.println("生成的代码是" + code);
        System.out.println("生成的代码是"+code);
    }

    @Override
    public void test() {
        System.out.println("锄禾日当午s");
        System.out.println("汗滴禾下土a");
        System.out.println("谁知盘中餐s");
        System.out.println("粒粒皆辛苦a");

        System.out.println("本地提交之后切换分支");
    }

    private String getNameByCode(String code){
        String name = "xingmsss"+code;
        return name;
    }
}
