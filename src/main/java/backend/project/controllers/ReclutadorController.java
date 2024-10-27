package backend.project.controllers;

import backend.project.entities.Empresa;
import backend.project.entities.Reclutador;
import backend.project.services.ReclutadorService;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reclutadores")
public class ReclutadorController {
    @Autowired
    private ReclutadorService rS;

    @PostMapping
    public void registrar(@RequestBody ReclutadorDTO dto) {
        ModelMapper m = new ModelMapper();
        Reclutador r = m.map(dto, Reclutador.class);
        rS.insert(r);
    }


    @GetMapping
    public List<ReclutadorDTO> listar() {
        return rS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ReclutadorDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void delete(@PathVariable("id")Integer id){
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public ReclutadorDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ReclutadorDTO dto = m.map(rS.ListId(id), ReclutadorDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void goUpdate(@RequestBody ReclutadorDTO dto){
        ModelMapper m = new ModelMapper();
        Reclutador r = m.map(dto, Reclutador.class);
        rS.insert(r);
    }

    @PostMapping("/buscarEmpresa")
    @ApiOperation(value = "Buscar reclutadores por empresa")
    public List<ReclutadorDTO> buscar(@RequestBody Empresa empresa) {
        return rS.buscarEmpresa(empresa).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReclutadorDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/MatchReclutador")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<ReclutadorMatchDTO> MatchReclutador() {
        List<ReclutadorMatchDTO> reclutadorMatchDTO = rS.reporte09();
        return reclutadorMatchDTO;
    }
}
