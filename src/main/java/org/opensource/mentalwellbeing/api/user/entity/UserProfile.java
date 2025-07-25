package org.opensource.mentalwellbeing.api.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_profiles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {

  @Id
  private String id;

  private String name;
  private String email;
  private String timezone;
  private String avatar;

  private AppPreferences preferences;
}
