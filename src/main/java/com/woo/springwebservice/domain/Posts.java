package com.woo.springwebservice.domain;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //JPA에서 제공하는 어노테이션
    /*
    @Id : 해당테이블의 PK를 나타냄
    @GeneratedValue : PK의 생성규칙, 기본값은 AUTO, mysql의 auto_increment와 같이 자동 증가하는 정수형 값. 스프링 부트 2에서는 옵션을 추가해야한다?
    @Column : 컬럼 사이즈 늘리고 싶을 때, Entity가 된 클래스의 멤버는 다 컬럼으로 쓰이지만 변경할 설정이 필요할 때 주로 사용.

    @NoArgsConstructor(access = AccessLevel.PROTECTED) : 기본생성자의 권한을 protected로 제한.
     - Entity 클래스를 프로젝트 코드상에서 기본 생성자로 생성하는 것은 막지만, JPA에서 Entity 클래스를 생성하는 것은 허용하기 위해서 추가!
    @Builder : 해당 클래스의 빌더패턴 클래스를  생성, 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함함.

     */
}
