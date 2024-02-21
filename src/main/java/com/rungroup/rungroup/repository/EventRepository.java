package com.rungroup.rungroup.repository;

import com.rungroup.rungroup.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
