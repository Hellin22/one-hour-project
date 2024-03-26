package studio.aroundhub.onehourproject.member.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.aroundhub.onehourproject.member.controller.dto.JoinRequest;
import studio.aroundhub.onehourproject.member.repository.MemberRepository;
import studio.aroundhub.onehourproject.member.repository.entity.Member;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public String join(JoinRequest joinRequest) {
        Member member = Member.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();
        memberRepository.save(member);

        return "success!!";
    }
}
