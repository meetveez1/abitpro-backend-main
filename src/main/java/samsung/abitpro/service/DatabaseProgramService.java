package samsung.abitpro.service;

import org.springframework.stereotype.Service;
import samsung.abitpro.model.Program;
import samsung.abitpro.repository.ProgramRepository;

import java.util.List;

@Service
public class DatabaseProgramService implements ProgramService {
    private final ProgramRepository programRepository;

    public DatabaseProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public List<Program> getAllProgram() {return programRepository.findAll();}


    @Override
    public Program getProgramById(long id) {return programRepository.findById(id).orElseThrow();}

    @Override
    public List<Program> searchProgramsByName(String name) {
        return List.of();
    }
}
