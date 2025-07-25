package org.opensource.mentalwellbeing.api.user.service;

import jakarta.validation.Valid;
import org.opensource.mentalwellbeing.api.user.dto.ProfileDTO;
import org.opensource.mentalwellbeing.api.user.entity.UserProfile;

public interface ProfileService {

  UserProfile createOrUpdate(@Valid ProfileDTO dto);

  UserProfile getByEmail(String email);
}
