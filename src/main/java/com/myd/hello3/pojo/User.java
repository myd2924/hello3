package com.myd.hello3.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/24 14:31
 * @Description:
 */
@Document
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 2557297873866630663L;

    @Id
    private Long id;

    @Field("user_name")
    private String userName;

    private String note;

    private List<Role> roles;
}
