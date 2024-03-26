package studio.aroundhub.onehourproject.member.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import studio.aroundhub.onehourproject.member.controller.dto.JoinRequest;
import studio.aroundhub.onehourproject.member.service.MemberService;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){
//        String id = joinRequest.getId();
//        String name = joinRequest.getName();
//        String phoneNumber = joinRequest.getPhoneNumber();
        // service에 dtd인 JoinRequest를 사용함으로써 굳이 이걸 안받아줘도 된다.

        String result = memberService.join(joinRequest);

        // if(result.equalsIgnoreCase("success!!")){ result가 null인 경우 nullPointException 발생 가능
        if("success!!".equalsIgnoreCase(result)){
            return "success!!";
        }else{
            return "failbb";
        }
    }
}
