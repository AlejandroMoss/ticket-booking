package com.mosscompanysas.domain.model.user.gateways;

import com.mosscompanysas.domain.model.user.User;

public interface userRepository {
    User save(User user);
    User findById(String id);
}
