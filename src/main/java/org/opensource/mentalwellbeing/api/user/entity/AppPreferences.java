package org.opensource.mentalwellbeing.api.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppPreferences {
  private String themeMode;      // dark / light
  private String language;       // en / hi
  private ReminderSettings reminder;
}
