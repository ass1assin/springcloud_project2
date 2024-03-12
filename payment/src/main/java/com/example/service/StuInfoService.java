package com.example.service;


import com.example.pojo.dto.StuInfoDto;
import com.example.pojo.vo.StuInfoOperateVo;


import java.util.List;

public interface StuInfoService {
    public List<StuInfoDto> getAll();

    public boolean insert(StuInfoOperateVo stuInfoOperateVo);

    public boolean delete(int id) throws Exception ;
}
