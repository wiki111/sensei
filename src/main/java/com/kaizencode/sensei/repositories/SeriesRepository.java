package com.kaizencode.sensei.repositories;

import com.kaizencode.sensei.model.Series;
import org.springframework.data.repository.CrudRepository;

public interface SeriesRepository extends CrudRepository<Series, Long> {
}
