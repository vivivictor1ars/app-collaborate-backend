package backend.project.serviceimpl;

import backend.project.entities.Portafolio;
import backend.project.repositories.PortafolioRepository;
import backend.project.services.PortafolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortafolioServiceImpl implements PortafolioService {
    @Autowired
    PortafolioRepository portafolioRepository;

    @Override
    public void insertPortafolio(Portafolio portafolio) {
        portafolioRepository.save(portafolio);
    }

    @Override
    public void deletePortafolio(Portafolio portafolio) {}
}
