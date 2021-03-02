package com.myd.hello3;

import com.myd.hello3.component.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/25 11:10
 * @Description:
 */
@SpringBootTest
public class TestMain {


    @Test
    public void test1(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Object myBean = annotationConfigApplicationContext.getBean("myBean");
        System.out.println(myBean.getClass().getSimpleName());
        Object myBean2 = annotationConfigApplicationContext.getBean("&myBean");
        System.out.println(myBean2.getClass().getSimpleName());
    }


}
