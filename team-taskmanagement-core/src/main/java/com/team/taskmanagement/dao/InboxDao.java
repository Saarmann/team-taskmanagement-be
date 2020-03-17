package com.team.taskmanagement.dao;

import com.team.taskmanagement.model.Inbox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InboxDao extends JpaRepository<Inbox, Long> {

}
