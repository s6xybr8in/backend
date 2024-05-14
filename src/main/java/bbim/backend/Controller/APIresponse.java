package bbim.backend.Controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class APIresponse {
    String content;

    public static APIresponse create(String content) {
        return new APIresponse(content);
    }

}
