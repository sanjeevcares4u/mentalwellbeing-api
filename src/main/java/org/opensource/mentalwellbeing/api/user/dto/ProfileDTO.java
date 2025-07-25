package org.opensource.mentalwellbeing.api.user.dto;

import lombok.Data;
import org.opensource.mentalwellbeing.api.user.entity.AppPreferences;

@Data
public class ProfileDTO {
  private String name;
  private String email;
  private String timezone;
  private String avatar;
  private AppPreferences preferences;
}