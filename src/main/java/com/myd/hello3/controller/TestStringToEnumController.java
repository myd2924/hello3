package com.myd.hello3.controller;

import com.myd.hello3.stringtoenum.EnumForm;
import com.myd.hello3.stringtoenum.enums.Color;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/10/14 01:04
 * @Description: TODO
 */
@RestController
public class TestStringToEnumController {

    @PostMapping("/converter")
    public Color test01(@RequestBody EnumForm form) {
        final String viewValue = form.getColor().toViewValue();
        final int ordinal = form.getColor().ordinal();
        final String name = form.getColor().name();

        return form.getColor();
    }
}
