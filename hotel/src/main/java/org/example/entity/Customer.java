package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    //  客户id
    private Integer id;

    //  客户账户名
    private String nickName;

    //  客户真名
    private String customerName;

    //  密码
    private String password;

    //  客户状态（Y正常，N注销）
    private String status;

    //  角色（0客户，1管理员）
    private Integer role;

    public Customer(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }
}