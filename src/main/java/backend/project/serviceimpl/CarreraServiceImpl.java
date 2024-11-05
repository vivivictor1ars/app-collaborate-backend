package backend.project.serviceimpl;

import backend.project.repositories.CarreraRepository;
import backend.project.services.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraServiceImpl implements CarreraService {
    @Autowired
    CarreraRepository carreraRepository;
}
