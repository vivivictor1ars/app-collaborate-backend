package backend.project.serviceimpl;

import backend.project.entities.Postulacion;
import backend.project.repositories.PostulacionRepository;
import backend.project.services.PostulacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostulacionServiceImpl implements PostulacionService {
    @Autowired
    PostulacionRepository mR;
}
