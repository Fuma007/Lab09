package se331.lab10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab10.entity.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}