package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="orders")
@Getter @Setter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne // 주문 : 회원 = 多 : 1
    @JoinColumn(name="member_id") // 외래키를 포함할 엔티티에 @joinColumn으로 FK의 이름을 적어주기
    private Member member;

    @OneToMany(mappedBy = "order") // 주문 : 주문상품 = 1 : 多
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="delivery_id")
    private Delivery delivery;

    private LocalDateTime orderDate; // LocalDateTime은 hibernate가 자동 지원해줌.

    @Enumerated(EnumType.STRING)
    private OrderStatus status; // 주문상태 [ORDER, CANCEL]
}
