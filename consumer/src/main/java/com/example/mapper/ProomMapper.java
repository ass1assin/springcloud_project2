package com.example.mapper;

import com.example.dto.ProomDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProomMapper {
    public List<ProomDto> getAll();
}
