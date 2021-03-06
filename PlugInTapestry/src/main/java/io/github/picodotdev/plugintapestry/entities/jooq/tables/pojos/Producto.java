/*
 * This file is generated by jOOQ.
*/
package io.github.picodotdev.plugintapestry.entities.jooq.tables.pojos;


import io.github.picodotdev.plugintapestry.entities.jooq.tables.interfaces.IProducto;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Producto implements IProducto {

    private static final long serialVersionUID = 103512361;

    private Long          id;
    private String        nombre;
    private String        descripcion;
    private Integer       cantidad;
    private LocalDateTime fecha;

    public Producto() {}

    public Producto(Producto value) {
        this.id = value.id;
        this.nombre = value.nombre;
        this.descripcion = value.descripcion;
        this.cantidad = value.cantidad;
        this.fecha = value.fecha;
    }

    public Producto(
        Long          id,
        String        nombre,
        String        descripcion,
        Integer       cantidad,
        LocalDateTime fecha
    ) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 100)
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @NotNull
    @Size(max = 5000)
    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public Integer getCantidad() {
        return this.cantidad;
    }

    @Override
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public LocalDateTime getFecha() {
        return this.fecha;
    }

    @Override
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Producto (");

        sb.append(id);
        sb.append(", ").append(nombre);
        sb.append(", ").append(descripcion);
        sb.append(", ").append(cantidad);
        sb.append(", ").append(fecha);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IProducto from) {
        setId(from.getId());
        setNombre(from.getNombre());
        setDescripcion(from.getDescripcion());
        setCantidad(from.getCantidad());
        setFecha(from.getFecha());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IProducto> E into(E into) {
        into.from(this);
        return into;
    }
}
