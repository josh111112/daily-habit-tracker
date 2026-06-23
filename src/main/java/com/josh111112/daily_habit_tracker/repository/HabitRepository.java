package com.josh111112.daily_habit_tracker.repository;

import com.josh111112.daily_habit_tracker.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {
}
