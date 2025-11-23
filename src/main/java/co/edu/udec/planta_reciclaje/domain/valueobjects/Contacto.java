package co.edu.udec.planta_reciclaje.domain.valueobjects;

public record Contacto(String telefono) {
  public Contacto {
    if (telefono == null || telefono.isBlank()) throw new IllegalArgumentException("Teléfono inválido");
  }
}