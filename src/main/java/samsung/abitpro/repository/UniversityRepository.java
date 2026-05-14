package samsung.abitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import samsung.abitpro.model.University;

import java.util.List;
@Repository
public interface UniversityRepository extends JpaRepository <University, Long> {
    List<University> findByNameContainingIgnoreCase(String Name);

}
