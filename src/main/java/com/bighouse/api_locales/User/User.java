package com.bighouse.api_locales.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Table(name = "users")
@Entity(name = "User")
@EntityListeners(AuditingEntityListener.class)
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = false)
    @NotNull
    private String login;

    @Column(length = 255, nullable = false)
    @NotNull
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private UserRole role;

    @NotNull
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @NotNull
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    public User() {}
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, UserRole role, Date dateCreated, Date dateUpdated) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    @PrePersist
    public void prePersist() {
        if (this.role == null) {
            this.role = UserRole.ROLE_USER;
        }
        if (this.dateCreated == null) {
            this.dateCreated = new Date();
        }
        if (this.dateUpdated == null) {
            this.dateUpdated = new Date();
        }
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.role == UserRole.ROLE_ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        else return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
