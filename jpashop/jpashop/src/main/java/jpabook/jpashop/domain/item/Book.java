package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("B") // 상속 분류에 대한 구분 값
@Getter @Setter
public class Book extends Item {
    private String author;
    private String isbn;
}
