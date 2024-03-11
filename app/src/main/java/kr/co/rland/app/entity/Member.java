package kr.co.rland.app.entity;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Member {
    
    private long id;
    private String username;
    private String pwd;
    private String email;
    private Date regDate;

}
