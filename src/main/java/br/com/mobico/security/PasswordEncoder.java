package br.com.mobico.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoder {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public String encode (String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    public boolean matchPassword(String password, String encodedPassword) {
        return bCryptPasswordEncoder.matches(password, encodedPassword);
    }
}
