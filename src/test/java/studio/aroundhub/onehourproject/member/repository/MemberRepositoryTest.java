package studio.aroundhub.onehourproject.member.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import studio.aroundhub.onehourproject.member.repository.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    public void crudTest(){
        Member member = Member.builder()
                .id("a")
                .name("ae")
                .phoneNumber("32323")
                .build();

        // create test
        memberRepository.save(member);

        // get test
        Member findMember = memberRepository.findById(1L).get();
    }


}
