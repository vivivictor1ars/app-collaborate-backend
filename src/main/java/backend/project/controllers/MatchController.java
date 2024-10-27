package backend.project.controllers;

import backend.project.dtos.MatchDTO;
import backend.project.entities.Postulacion;
import backend.project.services.PostulacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private PostulacionService mS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public void registrar(@RequestBody MatchDTO dto) {
        ModelMapper m = new ModelMapper();
        Postulacion mt = m.map(dto, Postulacion.class);
        mS.insertar(mt);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<MatchDTO> listar() {
        return mS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MatchDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public void delete(@PathVariable("id")Integer id){
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public MatchDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        MatchDTO dto = m.map(mS.ListId(id), MatchDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody MatchDTO dto){
        ModelMapper m = new ModelMapper();
        Postulacion r = m.map(dto, Postulacion.class);
        mS.insertar(r);
    }
}
