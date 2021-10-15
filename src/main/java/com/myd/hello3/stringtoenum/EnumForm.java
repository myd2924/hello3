package com.myd.hello3.stringtoenum;

import com.myd.hello3.stringtoenum.enums.Color;
import com.myd.hello3.stringtoenum.enums.Trigger;
import lombok.Getter;
import lombok.Setter;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/10/14 01:30
 * @Description: TODO
 */
@Setter
@Getter
public class EnumForm {
    Color color;
    Trigger trigger;
    String wo;
    Boolean hasHome;
}
