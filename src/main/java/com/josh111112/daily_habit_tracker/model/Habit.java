package com.josh111112.daily_habit_tracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

// entity
@Entity

// data - creates all the getters and setters
@Data

// generate constructors
@NoArgsConstructor
@AllArgsConstructor

public class Habit {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Integer streak;

    @Column(name = "limbic_friction")
    private Integer limbicFriction;

    @Column(name = "time_frame")
    private String timeFrame;

    @Column(name = "date_started")
    private LocalDate dateStarted;

    @Column(name = "last_checked_date")
    private LocalDate lastCheckedDate;
}
