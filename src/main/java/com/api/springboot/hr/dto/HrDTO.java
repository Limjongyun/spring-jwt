package com.api.springboot.hr.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HrDTO {
    private int code;
    private String msg;
    public HrDTO(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
