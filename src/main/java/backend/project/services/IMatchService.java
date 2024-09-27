package backend.project.services;

import backend.project.entities.Match;

import java.util.List;

public interface IMatchService {
    public void insertar(Match match);

    List<Match> listar();

    public void delete(int id);

    public Match ListId(int id);
}
