package admin

class Solicitud {
    int id
    double monto
    static hasOne=[convocatoria:admin.convocatoria,estado:admin.Estado_solicitud]
    static BelongsTo =admin.Miembro

    static constraints = {
        id(blank:false)
        monto(blank:false)
    }
}
