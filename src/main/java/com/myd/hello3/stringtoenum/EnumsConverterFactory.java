package com.myd.hello3.stringtoenum;

import com.myd.hello3.stringtoenum.enums.ConverterBaseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/10/14 00:57
 * @Description:
 */
@Component
@Slf4j
public class EnumsConverterFactory implements ConverterFactory<String,ConverterBaseEnum>{
    @Override
    public <T extends ConverterBaseEnum> Converter<String, T> getConverter(Class<T> target) {
        return source->{
            //根据序号映射的 0-yellow 1-red  2-green
            for(T t:target.getEnumConstants()){
                if(t.toViewValue().equals(source)){
                    return t;
                }
            }
            return null;
        };
    }
}
