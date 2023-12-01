package com.example.demo.DTO;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupportDTO implements Serializable {
    private String url = "https://reqres.in/#support-headings";
    private String text = "To keep ReqRes free, contributions towards server costs are appreciated!";
}
