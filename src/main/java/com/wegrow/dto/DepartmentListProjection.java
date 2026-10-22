package com.wegrow.dto;

//read-only view from native query
public interface DepartmentListProjection {

    Long getId();

    String getName();

    String getDescription();

    Long getEmployeeCount();
}