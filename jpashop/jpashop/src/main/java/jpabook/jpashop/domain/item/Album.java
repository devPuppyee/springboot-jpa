package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A") // 상속 분류에 대한 구분 값
@Getter @Setter
public class Album extends Item {
    private String artist;
    private String etc;
}
