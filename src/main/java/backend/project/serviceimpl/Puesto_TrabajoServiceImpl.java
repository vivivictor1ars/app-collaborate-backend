package backend.project.serviceimpl;

import backend.project.entities.Puesto_Trabajo;
import backend.project.repositories.Puesto_TrabajoRepository;
import backend.project.services.Puesto_TrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Puesto_TrabajoServiceImpl implements Puesto_TrabajoService {
    @Autowired
    Puesto_TrabajoRepository puesto_trabajoRepository;
}
