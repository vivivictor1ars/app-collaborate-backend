package backend.project.controllers;

import backend.project.dtos.Puesto_TrabajoDTO;
import backend.project.entities.Puesto_Trabajo;
import backend.project.services.Puesto_TrabajoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/puesto_trabajos")
public class Puesto_TrabajoController {
    @Autowired
    private Puesto_TrabajoService pS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void registrar(@RequestBody Puesto_TrabajoDTO dto) {
        ModelMapper m = new ModelMapper();
        Puesto_Trabajo pT = m.map(dto, Puesto_Trabajo.class);
        pS.insertar(pT);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<Puesto_TrabajoDTO> listar() {
        return pS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Puesto_TrabajoDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void delete(@PathVariable("id")Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public Puesto_TrabajoDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        Puesto_TrabajoDTO dto = m.map(pS.ListId(id), Puesto_TrabajoDTO.class);
        return dto;
    }


    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void goUpdate(@RequestBody Puesto_TrabajoDTO dto){
        ModelMapper m = new ModelMapper();
        Puesto_Trabajo pT = m.map(dto, Puesto_Trabajo.class);
        pS.insertar(pT);
    }
}
