package samsung.abitpro.controller;

import org.springframework.web.bind.annotation.*;
import samsung.abitpro.model.University;
import samsung.abitpro.service.UniversityService;

import java.util.List;

@RestController
@RequestMapping("/api/universities")

public class UniversityController {
    private UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping
    public List<University> getAllUniversities(){
        return universityService.getAllUniversity();
    }
    @GetMapping("/{id}")
    public University getUniversityById(@PathVariable long id){
        return universityService.getUniversityById(id);
    }
    @GetMapping("/search")
    public List<University>searchUniversityByName(@RequestParam String name){
        return universityService.searchUniversitiesByName(name);
    }
}
