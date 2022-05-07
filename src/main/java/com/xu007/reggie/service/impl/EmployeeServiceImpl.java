package com.xu007.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xu007.reggie.entity.Employee;
import com.xu007.reggie.mapper.EmployeeMapper;
import com.xu007.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author Xu007
 * @create 2022-05-04 23:38
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
