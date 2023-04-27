package com.fh.code.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fh.code.domain.Employee;
import com.fh.code.service.EmployeeService;
import com.fh.code.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;


//    @Override
//    public Page<Employee> selectEmployeePage(Page<Employee> page) {
//
//        return employeeMapper.selectPage(page,null);
//    }
}




