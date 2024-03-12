package com.example.service.impl;

import com.example.mapper.StuInfoMapper;
import com.example.pojo.dto.StuInfoDto;
import com.example.pojo.vo.StuInfoOperateVo;
import com.example.service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StuInfoServiceImpl implements StuInfoService {
    @Autowired
     StuInfoMapper stuInfoMapper;
    public List<StuInfoDto> getAll(){
       return stuInfoMapper.getAll();
    }

    public boolean insert(StuInfoOperateVo stuInfoOperateVo){
        return stuInfoMapper.insert(stuInfoOperateVo);
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean delete(int id) throws Exception {
        try{
            return stuInfoMapper.delete(id);
        }catch (Exception e){
            throw new Exception("删除失败，请联系管理员"+ e.getMessage());
        }
    }

//    public static void main(String[] args) {
//        StuInfoMapper stuInfoMapper1;
//
//    }
}
