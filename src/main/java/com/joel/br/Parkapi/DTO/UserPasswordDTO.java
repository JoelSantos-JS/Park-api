package com.joel.br.Parkapi.DTO;

public record UserPasswordDTO(String actualPassword, String newPassword, String confirmationPassword) {
}
