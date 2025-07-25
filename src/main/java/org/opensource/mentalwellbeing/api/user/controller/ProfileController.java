package org.opensource.mentalwellbeing.api.user.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.opensource.mentalwellbeing.api.user.dto.ProfileDTO;
import org.opensource.mentalwellbeing.api.user.entity.UserProfile;
import org.opensource.mentalwellbeing.api.user.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
@RequiredArgsConstructor
public class ProfileController {

  private final ProfileService profileService;

  @PostMapping("/save")
  public ResponseEntity<UserProfile> saveProfile(@RequestBody @Valid ProfileDTO dto) {
    return ResponseEntity.ok(profileService.createOrUpdate(dto));
  }

  @GetMapping("/{email}")
  public ResponseEntity<UserProfile> getProfile(@PathVariable String email) {
    return ResponseEntity.ok(profileService.getByEmail(email));
  }

}
