package cat.tecnocampus.securityjwt.api;

import cat.tecnocampus.securityjwt.application.UserLabService;
import cat.tecnocampus.securityjwt.application.dto.UserLabDTO;
import cat.tecnocampus.securityjwt.domain.ERole;
import cat.tecnocampus.securityjwt.domain.Role;
import cat.tecnocampus.securityjwt.domain.UserLab;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class APIController {

    private final UserLabService userLabService;

    public APIController(UserLabService userLabService) {
        this.userLabService = userLabService;
    }

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/helloAdmin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/helloUser")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("/helloUserAdmin")
    public String helloUserAdmin() {
        return "Hello User or Admin";
    }

    @GetMapping("/helloMe")
    public String helloMe(Principal principal) {
        return "Hello " + principal.getName();
    }

    // getMapping /moderator returning the url
    @GetMapping("/moderator")
    public String moderator() {
        return "moderator";
    }

    @GetMapping("/moderator/aaa")
    public String moderatorAaa() {
        return "moderator/aaa";
    }

    @GetMapping("/moderator/bbb")
    public String moderatorBbb() {
        return "moderator/bbb";
    }

    @GetMapping("/moderator/ccc")
    public String moderatorCcc() {
        return "moderator/ccc";
    }

    @GetMapping("/moderator/aaa/admin")
    public String moderatorAaaAdmin() {
        return "moderator/aaa/admin";
    }

    @GetMapping("/moderator/bbb/admin")
    public String moderatorBbbAdmin() {
        return "moderator/bbb/admin";
    }

    @GetMapping("/moderator/ccc/admin")
    public String moderatorCccAdmin() {
        return "moderator/ccc/admin";
    }

    // TODO 2 add a PostMapping to create a new user with a single role. The role must be ADMIN or USER or MODERATOR
    @PostMapping("/user/create")
    public UserLab createUser(@RequestBody UserLabDTO userDTO){
        UserLab userLab = userLabService.createUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userLab).getBody();
    }
}
