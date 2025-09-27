package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JD implements Switch{
    private String name;
    private Boolean status;

    @Override
    public void press() {
        status =!status;
    }
}
