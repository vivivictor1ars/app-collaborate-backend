package backend.project.serviceimpl;

import backend.project.entities.Institucion;
import backend.project.repositories.InstitucionRepository;
import backend.project.services.InstitucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitucionServiceImpl implements InstitucionService {
    @Autowired
    InstitucionRepository iR;
}
