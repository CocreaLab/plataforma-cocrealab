package org.cocrealab

class Estados_Estudios {
    Integer id
    String nombre
    static constraints = {
        id(blank: false,min: 1)
        nombre(blank: false)
    }
    static BelongsTo = Estudios_Miembros
}
