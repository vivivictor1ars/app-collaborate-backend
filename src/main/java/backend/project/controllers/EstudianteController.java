package backend.project.controllers;

import backend.project.entities.Carrera_Estudiante;
import backend.project.services.ICarrera_EstudianteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Carrera_Estudiante")
public class EstudianteController {
    @Autowired
    private ICarrera_EstudianteService cS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody Carrera_EstudianteDTO dto) {
        ModelMapper m = new ModelMapper();
        Carrera_Estudiante pT = m.map(dto, Carrera_Estudiante.class);
        cS.insertar(pT);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<Carrera_EstudianteDTO> listar() {
        return cS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Carrera_EstudianteDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Carrera_EstudianteDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        Carrera_EstudianteDTO dto = m.map(cS.ListId(id), Carrera_EstudianteDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody Carrera_EstudianteDTO dto){
        ModelMapper m = new ModelMapper();
        Carrera_Estudiante pT = m.map(dto, Carrera_Estudiante.class);
        cS.insertar(pT);
    }
}
