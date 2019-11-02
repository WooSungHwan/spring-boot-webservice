package com.woo.springwebservice.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
/* JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들(createdDate, modifiedDate)도 컬럼으로 인식하도록 합니다. */
@MappedSuperclass
/* BaseTimeEntity클래스에 Auditing 기능을 포함시킵니다. */
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity { //모든 Entity들의 상위 클래스가되어 Entity들의 createdDate, modifiedDate를 자동으로 관리.

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
