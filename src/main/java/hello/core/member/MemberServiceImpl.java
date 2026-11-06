package hello.core.member;

// 추상화에도 의존, 구체화에도 의존된 Bad Case : DIP 위반 
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        // TODO Auto-generated method stub
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memeberId) {
        // TODO Auto-generated method stub
        return memberRepository.findById(memeberId);
    }

}
