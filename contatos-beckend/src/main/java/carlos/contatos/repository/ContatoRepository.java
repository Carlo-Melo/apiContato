package carlos.contatos.repository;

import carlos.contatos.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
