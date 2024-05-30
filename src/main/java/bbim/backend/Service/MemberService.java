package bbim.backend.Service;

import bbim.backend.Domain.DTO.CreateMemberDto;
import bbim.backend.Domain.DTO.ResponseMemberGetDto;
import bbim.backend.Domain.Member;
import bbim.backend.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public String create(CreateMemberDto createMemberDto){
        Member member = Member.create(createMemberDto.name(), createMemberDto.age());
        memberRepository.save(member);
        return member.getId().toString();
    }
    public ResponseMemberGetDto findMember(Long memberId){
        Member member = memberRepository.findById(memberId);
        return new ResponseMemberGetDto(member.getName(), member.getAge(), member.getPosts());
    }
}
