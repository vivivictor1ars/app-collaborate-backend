package backend.project.services;

import backend.project.entities.Authority;
import backend.project.repositories.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface AuthorityService {
    public Authority addAuthority(Authority authority);
}
