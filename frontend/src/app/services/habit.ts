import { HttpClient } from '@angular/common/http';
import { inject, Service } from '@angular/core';
import { Observable } from 'rxjs';


export interface Habit {
    id?: number;
    name: string;
    description?: string;
    streak?: number;
    limbicFriction?: number;
    timeFrame?: string;
    dateStarted?: string;
    lastCheckedDate?: string;
}


@Service()
export class HabitService {
    private http = inject(HttpClient);

    private apiUrl = 'http://localhost:8080/api/habits';

    getHabits(): Observable<Habit[]> {
        return this.http.get<Habit[]>(this.apiUrl);
    }

    createHabit(habit: Habit): Observable<Habit> {
        return this.http.post<Habit>(this.apiUrl, habit);
    }

    checkHabit(id: number): Observable<Habit> {
        return this.http.put<Habit>(`${this.apiUrl}/${id}/check`, {});
    }

    uncheckHabit(id: number): Observable<Habit> {
        return this.http.put<Habit>(`${this.apiUrl}/${id}/uncheck`, {});
    }

    deleteHabit(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
    }
}