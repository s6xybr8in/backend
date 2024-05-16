package bbim.backend.Controller;

import bbim.backend.Domain.DTO.CreateMemberDto;
import bbim.backend.Domain.DTO.ResponseMemberCreateDto;
import bbim.backend.Domain.DTO.ResponseMemberGetDto;
import bbim.backend.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/member")
    public ResponseMemberCreateDto createMember(
            @RequestBody CreateMemberDto createMemberDto
    ){
        memberService.create(createMemberDto);
        return new ResponseMemberCreateDto(200, "멤버가 잘 생성됨.");
    }
    @GetMapping("/member/{memberId}")
    public ResponseMemberGetDto getMember(
            @PathVariable Long memberId
    ){
        return memberService.findMember(memberId);
    }
}
