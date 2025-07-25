package org.opensource.mentalwellbeing.api.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReminderSettings {
  private String dailyCheckInTime;    // e.g., "09:00"
  private String affirmationTime;     // e.g., "18:00"
}
