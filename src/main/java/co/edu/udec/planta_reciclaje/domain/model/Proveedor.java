package co.edu.udec.planta_reciclaje.domain.model;

import co.edu.udec.planta_reciclaje.domain.valueobjects.*;
import co.edu.udec.planta_reciclaje.domain.enums.*;
import java.util.Set;

public class Proveedor {

    private final idProveedor id;
    private NombreProveedor nombre;
    private DocumentoIdentidad documento; //Puede estar vacío si empresa no aplica
    private Contacto contacto;
    private Correo correo;
    private Frecuencia frecuencia;
    private Set<idMaterial> materialesSuministrados;

    public Proveedor(idProveedor id, NombreProveedor nombre, DocumentoIdentidad documento, Contacto contacto, Correo correo, Frecuencia frecuencia, Set<idMaterial> materialesSuministrados) {
        if (nombre == null) throw new Exception("Nombre requerido");
        if (contacto == null) throw new Exception("Teléfono requerido");
        if (correo == null) throw new Exception("Correo requerido");
        if (materialesSuministrados == null || materialesSuministrados.isEmpty())
            throw new Exception("Debe suministrar al menos un material");
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.contacto = contacto;
        this.correo = correo;
        this.frecuencia = frecuencia;
        this.materialesSuministrados = materialesSuministrados;
    }

    public idProveedor getId() { return id; }
    public NombreProveedor getNombre() { return nombre; }
    public DocumentoIdentidad getDocumento() { return documento; }
    public Contacto getContacto() { return contacto; }
    public Correo getCorreo() { return correo; }
    public Frecuencia getFrecuencia() { return frecuencia; }
    public Set<idMaterial> getMaterialesSuministrados() { return materialesSuministrados; }
}
