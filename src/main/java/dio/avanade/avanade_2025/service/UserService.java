package dio.avanade.avanade_2025.service;

import dio.avanade.avanade_2025.domain.model.Usuario;

public interface UserService {
    Usuario findById(Long id);

    Usuario create(Usuario usuarioToCreate);
}
