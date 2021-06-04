package com.github.kennedy.staties.repositories;

import com.github.kennedy.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
