package com.myd.hello3.config;

import com.myd.hello3.stringtoenum.EnumsConverterFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/10/14 01:02
 * @Description: TODO
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    EnumsConverterFactory enumsConverterFactory;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //registry.addConverterFactory(enumsConverterFactory);
    }
}
