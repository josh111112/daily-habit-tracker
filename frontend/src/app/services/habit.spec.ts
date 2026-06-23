import { TestBed } from '@angular/core/testing';

import { HabitService } from './habit';

describe('Habit', () => {
  let service: HabitService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HabitService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
