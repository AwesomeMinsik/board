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
public class MenuView {
    
private int id;
private String korName;
private String engName;
private int price;
private String img;
private Date regDate;
private long categoryId;
private int likeCount;

}
