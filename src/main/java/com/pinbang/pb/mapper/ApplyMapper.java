package com.pinbang.pb.mapper;

import com.pinbang.pb.entity.Apply;
import com.pinbang.pb.entity.ApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    long countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExample(ApplyExample example);

    Apply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}