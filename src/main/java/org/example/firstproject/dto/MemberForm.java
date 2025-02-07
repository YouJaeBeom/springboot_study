package org.example.firstproject.dto;

import org.example.firstproject.entity.Member;

public class MemberForm {
    private String email;
    private String password;

    @Override
    public String toString() {
        return "MemberForm{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public MemberForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Member toEntity() {
        return new Member(null, email, password);
    }
}
