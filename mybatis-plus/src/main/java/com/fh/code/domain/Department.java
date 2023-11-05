package com.fh.code.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 部门表
 * @TableName department
 */
@TableName(value ="department")
@Data
public class Department implements Serializable {
    /**
     * 部门id
     */
    @TableId(type = IdType.AUTO)
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

        /**
     * 单词
     */
    private String word;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
