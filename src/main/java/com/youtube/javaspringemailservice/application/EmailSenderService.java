package com.youtube.javaspringemailservice.application;

import com.youtube.javaspringemailservice.adapters.EmailSenderGateway;
import com.youtube.javaspringemailservice.core.usecases.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {
    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String toEmail, String subject, String body) {
        this.emailSenderGateway.sendEmail(toEmail, subject, body);
    }
}
