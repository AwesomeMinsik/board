package kr.co.rland.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Menu {
    private long id;
    private String korName;
    private String engName;
    //private String img;
    private int price;
    // private boolean like;
    // private Date ragDate;
}

