package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 상속 관계 전략은 부모 클래스에 지정
@DiscriminatorColumn(name= "dtype") // 상속값들에 대한 구분 컬럼 명
@Getter @Setter
public abstract class Item { // Item은 구현체를 사용할거기에 abstract class로 설계

    @Id
    @GeneratedValue
    @Column(name="item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
}
