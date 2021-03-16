package com.myd.hello3.mapper.oms;

import com.myd.hello3.dto.TStudent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/3 17:22
 * @Description:
 */
@Mapper
@Repository
public interface OmsMapper {
    List<TStudent> getStuList();
}
