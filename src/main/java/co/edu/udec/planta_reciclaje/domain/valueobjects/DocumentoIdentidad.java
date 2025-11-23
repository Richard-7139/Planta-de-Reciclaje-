package co.edu.udec.planta_reciclaje.domain.valueobjects;

public record DocumentoIdentidad(String tipo, String numero) {
  public DocumentoIdentidad {
    if (numero != null && numero.isBlank()) throw new IllegalArgumentException("Documento inválido");
  }
}