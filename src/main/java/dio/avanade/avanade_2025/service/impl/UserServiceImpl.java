package dio.avanade.avanade_2025.service.impl;

import dio.avanade.avanade_2025.domain.model.Usuario;
import dio.avanade.avanade_2025.domain.repository.UserRepository;
import dio.avanade.avanade_2025.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioToCreate) {
        if (usuarioToCreate.getId() != null &&  userRepository.existsById(usuarioToCreate.getId())) {
            throw new IllegalArgumentException("User with id " + usuarioToCreate.getId() + " already exists");
        }
        return userRepository.save(usuarioToCreate);
    }
}
