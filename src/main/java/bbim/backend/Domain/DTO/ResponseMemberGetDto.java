package bbim.backend.Domain.DTO;

import bbim.backend.Domain.Post;

import java.util.List;

public record ResponseMemberGetDto(
        String name,
        int age,
        List<Post> posts
) {
}