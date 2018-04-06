package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Tasks;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Tasks, Long> {

    List<Tasks> findByDuration(int duration);

    @Query
    List<Tasks> retrieveLongTasks();

    @Query
    List<Tasks> retrieveShortTasks();

    @Query
    List<Tasks> retrieveTasksWithDurationLongerThen(@Param("DURATION") int duration);

    @Query(nativeQuery = true)
    List<Tasks> retrieveTasksWithEnoughTime();

}