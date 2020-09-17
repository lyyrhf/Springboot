package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//部门表
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Department {
    private Integer id;
    private String departmentName;
}
