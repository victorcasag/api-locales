package com.bighouse.api_locales.User;

import java.util.Date;

public record RegisterDTO(String login, String password, UserRole role, Date dateCreated, Date date_updated) {
}
