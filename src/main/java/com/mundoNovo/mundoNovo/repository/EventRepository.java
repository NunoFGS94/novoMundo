package com.mundoNovo.mundoNovo.repository;

import com.mundoNovo.mundoNovo.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
