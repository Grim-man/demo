package com.cjh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjh.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<Test> {
    // 继承BaseMapper可以省略xml的编写
}
