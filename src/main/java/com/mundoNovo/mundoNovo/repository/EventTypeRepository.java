package com.mundoNovo.mundoNovo.repository;

import com.mundoNovo.mundoNovo.models.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository extends JpaRepository<EventType, Long> {
}
