package com.webflux.demo.user.model;

import lombok.Builder;
import lombok.Data;

@Data
@Table(name = "user")
@Builder
public class UserEntity {

    @Id
    @Column("id")
    private String id;
    @Column("password")
    private String password;
    @Column("nickname")
    private String nickname;

}
