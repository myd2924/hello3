package com.myd.hello3.form;

import com.myd.hello3.annotation.MinNum;
import lombok.Data;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/1 17:47
 * @Description:
 */
@Data
public class ValidateForm {

    private String name;

    @MinNum(value = 0,message = "不能为负数")
    private Integer num;

    private String note;
}
