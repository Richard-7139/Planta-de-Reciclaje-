package co.edu.udec.planta_reciclaje.domain.valueobjects;

public record NombreProveedor(String value) {
  public NombreProveedor { if (value == null || value.isBlank()) throw new IllegalArgumentException("Nombre inválido"); }
}