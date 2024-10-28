package backend.project.serviceimpl;

import backend.project.repositories.RepositorioRepository;
import backend.project.services.RepositorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositorioServiceImpl implements RepositorioService {
    @Autowired
    RepositorioRepository rR;
}
