package backend.project.serviceimpl;

import backend.project.entities.Empresa;
import backend.project.entities.Reclutador;
import backend.project.repositories.ReclutadorRepository;
import backend.project.services.ReclutadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReclutadorServiceImpl implements ReclutadorService {
    @Autowired
    ReclutadorRepository rR;
}
