package com.myd.hello3.component;

import com.myd.hello3.dto.TestMyFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/25 11:02
 * @Description: FactoryBean spring添加bean的方式有很多 @component @Bean等注解  这种方式主要服务第三方类 例如mybatis
 */
@Component
public class MyBean implements FactoryBean<TestMyFactoryBean>,InitializingBean{

    @Override
    public TestMyFactoryBean getObject() throws Exception {
        TestMyFactoryBean myFactoryBean = new TestMyFactoryBean();
        myFactoryBean.setName("马丁");
        myFactoryBean.setAge(32);
        myFactoryBean.setNote("工程师");
        return myFactoryBean;
    }

    @Override
    public Class<?> getObjectType() {
        return TestMyFactoryBean.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化之后，执行我");
    }
}
