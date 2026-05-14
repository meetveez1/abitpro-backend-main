package samsung.abitpro.service;

import samsung.abitpro.model.Program;
import samsung.abitpro.model.University;

import java.util.List;

public interface ProgramService {
    List<Program>getAllProgram();
    Program getProgramById(long id);
    List<Program>searchProgramsByName(String name);
}
