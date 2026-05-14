package samsung.abitpro.controller;

import org.springframework.web.bind.annotation.*;
import samsung.abitpro.model.Program;
import samsung.abitpro.model.University;
import samsung.abitpro.service.ProgramService;
import samsung.abitpro.service.UniversityService;

import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class ProgramController {
    private ProgramService programService;
    public ProgramController(ProgramService programService) {
        this.programService = programService;


    }
    @GetMapping
    public List<Program> getAllProgram(){
        return programService.getAllProgram();
    }
    @GetMapping("/{id}")
    public Program getProgramById(@PathVariable long id){
        return programService.getProgramById(id);
    }
    @GetMapping("/search")
    public List<Program>searchProgramByName(@RequestParam String name){
        return programService.searchProgramsByName(name);
    }
}
