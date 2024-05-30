package bbim.backend.Repository;

import bbim.backend.Domain.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long id);
}