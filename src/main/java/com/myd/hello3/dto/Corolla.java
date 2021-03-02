package com.myd.hello3.dto;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/25 14:24
 * @Description: 卡罗拉
 */
public class Corolla implements InitializingBean{

    Egine egine;

    public Corolla(){
        System.out.println("Corolla Contructor");
        if(null == egine){
            System.out.println("egine is not setting");
        } else {
            System.out.println("egine is intalled");
        }
    }

    public void start(){
        egine.fire();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        egine.fire();
    }

    public void setEgine(Egine egine) {
        this.egine = egine;
    }
}
