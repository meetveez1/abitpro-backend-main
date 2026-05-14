package samsung.abitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import samsung.abitpro.model.Program;



import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
    List<Program> findByNameContainingIgnoreCase(String Name);
}
