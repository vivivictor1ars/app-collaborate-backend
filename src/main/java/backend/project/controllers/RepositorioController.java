package backend.project.controllers;

import backend.project.entities.Repositorio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/repositorios")
public class RepositorioController {
    @Autowired
    private IRepositorioService rS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE')")
    public void insert(@RequestBody RepositorioDTO dto){
        ModelMapper m = new ModelMapper();
        Repositorio r = m.map(dto, Repositorio.class);
        rS.insert(r);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<RepositorioDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RepositorioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE')")
    public void delete(@PathVariable("id")Integer id){
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public RepositorioDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        RepositorioDTO dto = m.map(rS.ListId(id), RepositorioDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE')")
    public void goUpdate(@RequestBody RepositorioDTO dto){
        ModelMapper m = new ModelMapper();
        Repositorio r = m.map(dto, Repositorio.class);
        rS.insert(r);
    }

    @GetMapping("/repositorios-count")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<RepositorioEstudianteDTO> obtenerNumRepositorios() {
        List<RepositorioEstudianteDTO> RepositorioEstudianteDTO = rS.reporte02();
        return RepositorioEstudianteDTO;
    }
}
