package backend.project.controllers;

import backend.project.dtos.HabilidadDTO;
import backend.project.entities.Habilidad;
import backend.project.services.HabilidadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Habilidades")
public class HabilidadController {
    @Autowired
    private HabilidadService rS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void insert(@RequestBody HabilidadDTO dto){
        ModelMapper m = new ModelMapper();
        Habilidad r = m.map(dto,Habilidad.class);
        rS.insert(r);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public List<HabilidadDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, HabilidadDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void delete(@PathVariable("id")Integer id){
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public HabilidadDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        HabilidadDTO dto = m.map(rS.ListId(id), HabilidadDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void goUpdate(@RequestBody HabilidadDTO dto){
        ModelMapper m = new ModelMapper();
        Habilidad r = m.map(dto, Habilidad.class);
        rS.insert(r);
    }
}
