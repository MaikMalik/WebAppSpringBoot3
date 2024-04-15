package dev.maik.runnerz.run;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface RunRepository extends ListCrudRepository<Run, Integer> {

    //Encontrar todas las localizaciones
    List<Run> findAllByLocation(String Location);
}
