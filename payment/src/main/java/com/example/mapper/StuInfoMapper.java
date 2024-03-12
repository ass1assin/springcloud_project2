package com.example.mapper;

import com.example.pojo.dto.StuInfoDto;
import com.example.pojo.vo.StuInfoOperateVo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StuInfoMapper{
    public List<StuInfoDto> getAll();

    public boolean insert(StuInfoOperateVo stuInfoOperateVo);

    public boolean delete(int id);

}
