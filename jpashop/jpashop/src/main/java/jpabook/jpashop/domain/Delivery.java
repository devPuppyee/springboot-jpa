package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.math3.analysis.function.Add;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name="delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery") // 1:1 - 1:1관계일때는 access를 더 많이하는 entity에 FK를 둔다 생각
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; // READY, COMP
}
