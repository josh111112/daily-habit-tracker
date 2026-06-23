import { Component, inject, OnInit, signal } from '@angular/core';
import { HabitService, Habit } from './services/habit';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App implements OnInit {
  protected readonly title = signal('frontend');
  private habitService = inject(HabitService);
  protected habits = signal<Habit[]>([]);
  protected showCreateModal = signal(false);
  
  protected newHabitName = signal('');
  protected newHabitDescription = signal('');

  ngOnInit(): void {
    this.loadHabits();
  }

  private loadHabits(): void {
    this.habitService.getHabits().subscribe({
      next: (data) => this.habits.set(data),
      error: (err) => console.error('Error fetching habits:', err)
    });
  }

  protected openCreateModal() {
    this.showCreateModal.set(true);
  }

  protected closeCreateModal() {
    this.showCreateModal.set(false);
  }

  protected createHabit() {
    if (!this.newHabitName()) return;
    const habit: Habit = {
      name: this.newHabitName(),
      description: this.newHabitDescription(),
      streak: 0
    };
    this.habitService.createHabit(habit).subscribe({
      next: (h) => {
        this.habits.update(habits => [...habits, h]);
        this.closeCreateModal();
        this.newHabitName.set('');
        this.newHabitDescription.set('');
      },
      error: (err) => console.error('Error creating habit:', err)
    });
  }

  protected isHabitCheckedToday(habit: Habit): boolean {
    if (!habit.lastCheckedDate) return false;
    const today = new Date().toISOString().split('T')[0];
    return habit.lastCheckedDate === today;
  }

  protected toggleHabit(habit: Habit) {
    if (!habit.id) return;
    const isChecked = this.isHabitCheckedToday(habit);
    const obs = isChecked ? this.habitService.uncheckHabit(habit.id) : this.habitService.checkHabit(habit.id);
    
    obs.subscribe({
      next: () => this.loadHabits(),
      error: (err) => console.error('Error toggling habit:', err)
    });
  }

  protected deleteHabit(id: number | undefined) {
    if (!id) return;
    if (confirm('Are you sure you want to delete this habit?')) {
      this.habitService.deleteHabit(id).subscribe({
        next: () => this.loadHabits(),
        error: (err) => console.error('Error deleting habit:', err)
      });
    }
  }
}
