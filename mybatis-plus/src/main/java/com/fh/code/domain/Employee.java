package com.fh.code.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 员工表
 * @TableName employee
 */
@TableName(value ="employee")
@Data
public class Employee implements Serializable {
    /**
     * 员工id
     */
    @TableId(type = IdType.AUTO)
    private Integer empId;

    /**
     * 员工名称
     */
    private String empName;

    /**
     * 员工性别
     */
    private String gender;

    /**
     * 员工邮箱
     */
    private String email;

    /**
     * 员工所属部门id
     */
    private Integer deptId;

    @TableField(exist = false)
    private String deptName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}