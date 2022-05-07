package com.xu007.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.xu007.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Xu007
 * @create 2022-05-04 23:36
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
