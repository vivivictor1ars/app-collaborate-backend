package backend.project.serviceimpl;

import backend.project.repositories.PortafolioRepository;
import backend.project.services.PortafolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortafolioServiceImpl implements PortafolioService {
    @Autowired
    PortafolioRepository rR;
}
