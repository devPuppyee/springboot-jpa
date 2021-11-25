package jpabook.jpashop.domain;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        // command와 retrieve를 분리하는 것이 좋음 (side effect 방지를 위해)
        return member.getId();
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
