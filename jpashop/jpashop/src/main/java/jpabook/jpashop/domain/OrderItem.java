package jpabook.jpashop.domain;

import jpabook.jpashop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name= "order_item_id")
    private Long id;

    // 주문상품 : 상품 = 多 : 1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY) // 주문상품 : 주문 = 多 : 1
    @JoinColumn(name="order_id")
    private Order order;
    
    private int orderPrice; // 주문 가격
    private int count; // 주문 수량
}
