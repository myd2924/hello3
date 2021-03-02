package com.myd.hello3.component;

import com.myd.hello3.dto.Corolla;
import com.myd.hello3.dto.Egine;
import com.myd.hello3.dto.SpecialBeanForEgine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/25 11:12
 * @Description:
 */
@Configuration
@ComponentScan("com.myd.hello3.component")
public class MyConfig {

    @Bean
    public SpecialBeanForEgine getEgine(){
        return new SpecialBeanForEgine();
    }

    @Bean(initMethod = "start")
    public Corolla corolla(Egine egine){
        Corolla col = new Corolla();
        col.setEgine(egine);
        col.start();
        return col;
    }
}
