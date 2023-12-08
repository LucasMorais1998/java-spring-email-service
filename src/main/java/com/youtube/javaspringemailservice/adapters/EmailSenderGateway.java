package com.youtube.javaspringemailservice.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
