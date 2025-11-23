package co.edu.udec.planta_reciclaje.domain.valueobjects;

public record Correo(String email) {
  public Correo {
    if (email == null || email.isBlank()) throw new IllegalArgumentException("Correo inválido");
  }
}