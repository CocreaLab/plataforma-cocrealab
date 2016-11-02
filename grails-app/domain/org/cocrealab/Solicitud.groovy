package org.cocrealab

class Solicitud {
    Integer id
    double monto
    static hasOne=[convocatoria:admin.convocatoria,estado:admin.Estado_solicitud]
    static BelongsTo =Miembro

    static constraints = {
        id(blank:false)
        monto(blank:false)
    }
}
