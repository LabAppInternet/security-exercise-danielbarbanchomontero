package cat.tecnocampus.securityjwt.application.dto;

import cat.tecnocampus.securityjwt.domain.Role;

import java.util.Set;

public record UserLabDTO(Long id, String username, String email, String password, Set<Role> role) {
}
