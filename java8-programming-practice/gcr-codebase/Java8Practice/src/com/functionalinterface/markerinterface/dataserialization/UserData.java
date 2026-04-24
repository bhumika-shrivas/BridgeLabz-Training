package com.functionalinterface.markerinterface.dataserialization;

import java.io.Serializable;

@SuppressWarnings("serial")
class UserData implements Backupable, Serializable {
    String username;
    String email;

    UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
