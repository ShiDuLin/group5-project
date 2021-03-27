package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName User
 * Description
 *
 * @author 阿木木
 * @date 2021/3/27 9:43
 * Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String userName;
    private String password;
    private String address;
    private String tel;

}
