package org.opensource.mentalwellbeing.api.user.service.impl;

import lombok.RequiredArgsConstructor;
import org.opensource.mentalwellbeing.api.user.dto.ProfileDTO;
import org.opensource.mentalwellbeing.api.user.entity.UserProfile;
import org.opensource.mentalwellbeing.api.user.repository.ProfileRepository;
import org.opensource.mentalwellbeing.api.user.service.ProfileService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

  private  final ProfileRepository profileRepository;

  @Override
  public UserProfile createOrUpdate(ProfileDTO dto) {
    Optional<UserProfile> optional = profileRepository.findByEmail(dto.getEmail());
    UserProfile profile = optional.orElse(new UserProfile());

    profile.setName(dto.getName());
    profile.setEmail(dto.getEmail());
    profile.setTimezone(dto.getTimezone());
    profile.setAvatar(dto.getAvatar());
    profile.setPreferences(dto.getPreferences());

    return profileRepository.save(profile);
  }

  @Override
  public UserProfile getByEmail(String email) {
    return profileRepository.findByEmail(email)
        .orElseThrow(() -> new RuntimeException("User not found"));
  }
}
