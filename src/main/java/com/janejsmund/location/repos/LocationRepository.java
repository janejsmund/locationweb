package com.janejsmund.location.repos;

import com.janejsmund.location.entities.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
