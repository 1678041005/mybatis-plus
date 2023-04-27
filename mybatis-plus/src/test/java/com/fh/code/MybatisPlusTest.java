package com.fh.code;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.fh.code.domain.Department;
import com.fh.code.mapper.DepartmentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @autor : Yaoyaoyao
 * @date: 2023/4/26 10:27
 * @version: 1.0
 */
@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void testAdd(){
        Department department = new Department();
        department.setDeptId(5);
        department.setDeptName("呵呵哈哈哈");
        this.departmentMapper.insert(department);
    }

    @Test
    void testUpdate(){
        Department department = new Department();
        department.setDeptId(4);
        department.setDeptName("呵呵哈哈哈");
        UpdateWrapper<Department> wrapper = new UpdateWrapper<>();
        wrapper.set("dept_name","开发部").eq("dept_id",5);
        departmentMapper.update(null,wrapper);
    }

    @Test
    void testDelete(){
        Map<String, Object> map = new HashMap<>();
        map.put("dept_name","发部");
        departmentMapper.deleteByMap(map);
    }

    @Test
    void testQuery(){
        List<Department> list = departmentMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
