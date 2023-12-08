package com.youtube.javaspringemailservice.core;

public record EmailRequest(String to, String subject, String body) {
}
