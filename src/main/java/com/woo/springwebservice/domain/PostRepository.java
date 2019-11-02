package com.woo.springwebservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> {
    //보콩 MyBatis에서 Dao 라고 불리는 DB Layer 접근자.
    //JPA에선 Repository라고 부르며 인터페이스로 생성.
    // 단순히 인터페이스로 생성하고 JpaRepository<클래스타입, PK타입> 을 상속하면 기본적인 CRUD 메소드가 자동생성됨.

}
