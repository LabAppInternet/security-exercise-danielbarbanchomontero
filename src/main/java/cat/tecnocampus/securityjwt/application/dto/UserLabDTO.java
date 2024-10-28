package cat.tecnocampus.securityjwt.application.dto;

import cat.tecnocampus.securityjwt.domain.ERole;

public record UserLabDTO(String username, String email, String password, ERole role) {
}
