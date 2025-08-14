package org.springframework.security.crypto.bcrypt;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptPasswordEncoder {

    // Hash a password
    public String encode(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Verify a password against a hash
    public boolean matches(String rawPassword, String encodedPassword) {
        if (encodedPassword == null || encodedPassword.isEmpty()) return false;
        return BCrypt.checkpw(rawPassword, encodedPassword);
    }
}
