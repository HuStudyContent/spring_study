package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//有参构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
public class User {
  private int id;
  private String name;
  private String pwd;
}
