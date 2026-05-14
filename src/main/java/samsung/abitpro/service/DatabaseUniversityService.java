package samsung.abitpro.service;

import org.springframework.stereotype.Service;
import samsung.abitpro.model.University;
import samsung.abitpro.repository.UniversityRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class DatabaseUniversityService implements UniversityService {
    private final UniversityRepository universityRepository;

    public DatabaseUniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public List<University> getAllUniversity()  {
        return universityRepository.findAll();
    }

    @Override
    public University getUniversityById(long id) {
        return universityRepository.findById(id).orElseThrow();
    }

    @Override
    public List<University> searchUniversitiesByName(String name) {
        return universityRepository.findByNameContainingIgnoreCase(name);
    }
}
