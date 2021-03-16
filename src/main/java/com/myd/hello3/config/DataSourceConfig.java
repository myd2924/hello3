package com.myd.hello3.config;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/3 15:24
 * @Description:
 */
@Configuration
public class DataSourceConfig {

    /**
     * oms
     */
    @Configuration
    @Order(Ordered.HIGHEST_PRECEDENCE+2)
    @MapperScan(basePackages = "com.myd.hello3.mapper."+OMSConfig.PREFIX,
    sqlSessionFactoryRef = OMSConfig.PREFIX+"SqlSessionFactory",
    sqlSessionTemplateRef = OMSConfig.PREFIX+"SqlSessionTemplate" )
    static class OMSConfig{
        protected static final transient String PREFIX = "oms";

        @Bean(name = PREFIX + "DataSourceProperties")
        @ConfigurationProperties(PREFIX + ".spring.datasource")
        public DataSourceProperties dataSourceProperties(){
            return new DataSourceProperties();
        }

        @Bean(name = PREFIX + "DataSource")
        @ConfigurationProperties(PREFIX + ".spring.datasource")
        public DataSource initDataSource(){
            return dataSourceProperties().initializeDataSourceBuilder().build();
        }

        @Bean(name = PREFIX  + "TransactionManage")
        public PlatformTransactionManager dataSourceTransactionManage(@Qualifier(PREFIX + "DataSource") DataSource dataSource){
            return new DataSourceTransactionManager(dataSource);
        }

        @Bean(name = PREFIX + "SqlSessionFactory")
        public SqlSessionFactory sqlSessionFactory(@Qualifier(PREFIX + "DataSource") DataSource dataSource) throws Exception {
            final MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
            sqlSessionFactoryBean.setDataSource(dataSource);
            return sqlSessionFactoryBean.getObject();
        }

        @Bean(name = PREFIX + "DataSource")
        public SqlSessionTemplate sqlSessionTemplate(@Qualifier(PREFIX + "DataSource") DataSource dataSource) throws Exception {
            return new SqlSessionTemplate(sqlSessionFactory(dataSource));

        }
    }
}
