package com.fh.code;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.code.domain.Department;
import com.fh.code.domain.Employee;
import com.fh.code.mapper.EmployeeMapper;
import com.fh.code.service.DepartmentService;
import com.fh.code.service.EmployeeService;

import com.github.yulichang.wrapper.MPJLambdaWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @autor : Yaoyaoyao
 * @date: 2023/4/26 11:17
 * @version: 1.0
 */
@SpringBootTest
public class MybatisPlusServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;


    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void testAdd() {

        Department department = new Department();
        department.setDeptName("adfa");
        department.setDeptId(6);
        departmentService.save(department);
    }

    @Test
    void testUpdate(){
        Department department = new Department();
        department.setDeptName("gsgss");
        department.setDeptId(6);
//        departmentService.updateById(department);
        UpdateWrapper<Department> wrapper = new UpdateWrapper<>();
        wrapper.set("dept_name","产品").eq("dept_id",6);
        departmentService.update(wrapper);
    }

    @Test
    void testSelect(){
//        MPJQueryWrapper<Employee> queryWrapper = new MPJQueryWrapper<>();
//        queryWrapper.select("t.*","department.dept_name as deptName")
//                .leftJoin("department on t.dept_id = department.dept_id")
//        .eq("t.dept_id",1);


        MPJLambdaWrapper<Employee> queryWrapper = new MPJLambdaWrapper<>();
        queryWrapper
                .selectAll(Employee.class)
                .select(Department::getDeptName)
                .leftJoin(Department.class,Department::getDeptId,Employee::getDeptId)
                .eq(Employee::getDeptId,1);
        List<Employee> list = employeeService.list(queryWrapper);
        list.forEach(System.out::println);


    }

    @Test
    void testPage(){

        Page<Employee> page = new Page<>(1,2);
        Page<Employee> selectPage = employeeMapper.selectPage(page, null);
        List<Employee> list = selectPage.getRecords();
        list.forEach(System.out::println);
    }
}
