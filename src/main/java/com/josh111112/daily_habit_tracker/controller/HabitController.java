package com.josh111112.daily_habit_tracker.controller;

import com.josh111112.daily_habit_tracker.model.Habit;
import com.josh111112.daily_habit_tracker.repository.HabitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/habits")
@CrossOrigin(origins = "http://localhost:4200")
public class HabitController {
    @Autowired
    private HabitRepository habitRepository;

    @GetMapping
    public List<Habit> getAllHabits() {
        return habitRepository.findAll();
    }

    @PostMapping
    public Habit createHabit(@RequestBody Habit habit) {
        return habitRepository.save(habit);
    }

    @PutMapping("/{id}/check")
    public Habit checkHabit(@PathVariable Long id) {
        Habit habit = habitRepository.findById(id).orElseThrow(() -> new RuntimeException("Habit not found"));
        habit.setStreak(habit.getStreak() == null ? 1 : habit.getStreak() + 1);
        habit.setLastCheckedDate(LocalDate.now());
        return habitRepository.save(habit);
    }

    @PutMapping("/{id}/uncheck")
    public Habit uncheckHabit(@PathVariable Long id) {
        Habit habit = habitRepository.findById(id).orElseThrow(() -> new RuntimeException("Habit not found"));
        habit.setStreak(habit.getStreak() == null || habit.getStreak() == 0 ? 0 : habit.getStreak() - 1);
        habit.setLastCheckedDate(LocalDate.now().minusDays(1)); // set to yesterday
        return habitRepository.save(habit);
    }

    @DeleteMapping("/{id}")
    public void deleteHabit(@PathVariable Long id) {
        habitRepository.deleteById(id);
    }
}
