package com.youtube.javaspringemailservice.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
