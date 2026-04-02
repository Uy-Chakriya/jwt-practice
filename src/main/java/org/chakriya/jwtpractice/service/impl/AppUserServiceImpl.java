package org.chakriya.jwtpractice.service.impl;
import lombok.RequiredArgsConstructor;
import org.chakriya.jwtpractice.repository.AppUserReposirory;
import org.chakriya.jwtpractice.service.AppUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private final AppUserReposirory appUserReposirory;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return appUserReposirory.getUserByEmail(email);
    }
}
