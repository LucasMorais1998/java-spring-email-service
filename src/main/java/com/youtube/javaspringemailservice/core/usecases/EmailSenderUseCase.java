package com.youtube.javaspringemailservice.core.usecases;

public interface EmailSenderUseCase {
    void sendEmail(String toEmail, String subject, String body);
}
