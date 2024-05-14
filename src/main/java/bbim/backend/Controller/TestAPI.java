package bbim.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
    @GetMapping("/test")
    public String test() {
        return "2주차 세션 테스트 API 입니다!";
    }

    @GetMapping("/tjson")
    public APIresponse testJson(){
        return APIresponse.create("FFFFFFFFFFFFFJSONAPI");
    }



    @GetMapping("/bab")
    public String bab() {
        return "Bob is Gomi";
    }

}
