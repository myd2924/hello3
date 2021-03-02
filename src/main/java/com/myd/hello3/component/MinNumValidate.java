package com.myd.hello3.component;

import com.myd.hello3.annotation.MinNum;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/1 19:41
 * @Description:
 */
@Component
public class MinNumValidate implements ConstraintValidator<MinNum,Integer>{

    private Integer value;

    @Override
    public void initialize(MinNum constraintAnnotation) {
        this.value = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("又进来了");
        if(Objects.isNull(integer)){
            return true;
        }
        if(integer.compareTo(this.value)>=0){
            return true;
        }
        return false;
    }
}
