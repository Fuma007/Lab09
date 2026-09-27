package se331.lab10.dao;

import se331.lab10.entity.Participant;

import java.util.List;

public interface ParticipantDao {
    List<Participant> getAllParticipants();
    Participant getParticipant(Long id);
    Participant save(Participant participant);
}