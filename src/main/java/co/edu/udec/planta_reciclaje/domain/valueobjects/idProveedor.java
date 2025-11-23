package co.edu.udec.planta_reciclaje.domain.valueobjects;

public record idProveedor(String value) {
    public idProveedor {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Id no puede estar vacío.");
        }
    }
}