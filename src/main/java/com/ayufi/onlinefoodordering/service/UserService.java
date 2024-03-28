package com.ayufi.onlinefoodordering.service;

import com.ayufi.onlinefoodordering.model.User;

public interface UserService {
    public User findUserByJwtToken(String jwt) throws Exception;

    public User findUserByEmail(String email) throws Exception;
}
