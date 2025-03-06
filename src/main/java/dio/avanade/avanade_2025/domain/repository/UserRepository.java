package dio.avanade.avanade_2025.domain.repository;

import dio.avanade.avanade_2025.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
}
