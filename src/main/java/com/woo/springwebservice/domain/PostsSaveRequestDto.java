package com.woo.springwebservice.domain;

import lombok.Data;

@Data
public class PostsSaveRequestDto {
    // Controller에서 @RequestBody로 외부에서 데이터를 받는 경우엔 기본생성자 + set메소드를 통해서만 값이 할당됩니다.

    //DTO를 따로 만들어준 이유. : DB Layer와 View Layer를 담당하는 데이터 클래스를 나누기 위함.
    //DB 엔티티 클래스는 변경 횟수가 적지만. View 데이터 클래스(param, result) 는 요구사항이 변할때마다 변경되기 쉽기 때문.

    private String title;
    private String content;
    private String author;

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
