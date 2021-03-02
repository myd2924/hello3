package com.myd.hello3.pojo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/24 14:42
 * @Description:
 */
@Document
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = -8961361827770236842L;

    private Long id;

    @Field("role_name")
    private String roleName;

    private String note;

}
