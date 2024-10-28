package cat.tecnocampus.securityjwt.application;

import cat.tecnocampus.securityjwt.application.dto.UserLabDTO;
import cat.tecnocampus.securityjwt.domain.UserLab;
import cat.tecnocampus.securityjwt.persistence.UserLabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLabService {
    @Autowired
    private UserLabRepository userLabRepository;

    public UserLab createUser(UserLabDTO userDTO) {
        UserLab user = new UserLab();
        user.setUsername(userDTO.username());
        user.setPassword(userDTO.password());
        user.setOneRole(userDTO.role());
        return userLabRepository.save(user);
    }
}
