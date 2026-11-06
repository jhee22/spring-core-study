package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; 
    
    // VIP라면 1,000원 할인, 일반 회원은 할인 X 
    @Override
    public int discount(Member member, int price) {
        // TODO Auto-generated method stub
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount; 
        } else {
            return 0;
        }
    }

}
