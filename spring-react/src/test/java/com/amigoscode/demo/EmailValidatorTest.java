package com.amigoscode.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmailValidatorTest {

    private final EmailValidator underTest = new EmailValidator();

    @Test
    public void isShouldValidateCorrectEmail() {
        assertThat(underTest.test("hello@gmail.com")).isTrue();
    }

    @Test
    public void isShouldValidateAnIncorrectEmail() {
        assertThat(underTest.test("hellogmail.com")).isFalse();
    }

    @Test
    public void isShouldValidateAnIncorrectEmailWithoutDotAtTheEnd() {
        assertThat(underTest.test("hellog@mailcom")).isFalse();
    }
}