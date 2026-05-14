package samsung.abitpro.service;

import samsung.abitpro.model.University;

import java.util.List;

public interface UniversityService {
    List<University>getAllUniversity();
    University getUniversityById(long id);
    List<University>searchUniversitiesByName(String name);
}
