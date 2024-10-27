package backend.project.controllers;

import backend.project.dtos.InstitucionDTO;
import backend.project.entities.Institucion;
import backend.project.services.InstitucionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Institucion_Educativa")
public class InstitucionController {
    @Autowired
    private InstitucionService iS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody InstitucionDTO dto){
        ModelMapper m = new ModelMapper();
        Institucion i = m.map(dto,Institucion.class);
        iS.insert(i);
    }

    @GetMapping
    public List<InstitucionDTO> list(){
        return iS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, InstitucionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        iS.delete(id);
    }
    @GetMapping("/{id}")
    public InstitucionDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        InstitucionDTO dto = m.map(iS.ListId(id), InstitucionDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody InstitucionDTO dto){
        ModelMapper m = new ModelMapper();
        Institucion i = m.map(dto, Institucion.class);
        iS.insert(i);
    }
}
