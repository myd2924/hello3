package com.myd.hello3.dto;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/25 14:31
 * @Description:
 */
public class SpecialBeanForEgine implements BeanFactoryPostProcessor,BeanNameAware {

    private String name;

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry)beanFactory;
        GenericBeanDefinition gbd = new GenericBeanDefinition();
        gbd.setBeanClass(EgineFactory.class);
        gbd.setScope(BeanDefinition.SCOPE_SINGLETON);
        gbd.setAutowireCandidate(true);
        registry.registerBeanDefinition("egine01",gbd);
    }

    public static class EgineFactory implements FactoryBean<Egine>,BeanNameAware,InvocationHandler{

        String name;
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("here is invoke egine"+method.getName());
            return null;
        }

        @Override
        public void setBeanName(String name) {
            this.name = name;
        }

        @Override
        public Egine getObject() throws Exception {
            System.out.println("EgineFactory builder egine01 , EgineFactory:"+name);
            Egine proxy = (Egine)Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{Egine.class},this);
            return proxy;
        }

        @Override
        public Class<?> getObjectType() {
            return Egine.class;
        }
    }
}
