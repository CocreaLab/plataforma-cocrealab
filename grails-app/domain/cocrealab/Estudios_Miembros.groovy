package admin

class Estudios_Miembros {

    int id
    int periodos_cursados
    Date fecha_culminacion
    static hasOne = [programa_estudio:admin.Programa_Campus,estado:admin.Estados_Estudios]
    static BelongsTo = admin.Miembro
    static constraints = {
        fecha_culminacion(blank: false)
        id(blank: false)
        periodos_cursados(blank: false,min:1,max:10)
    }
    static mapping={
        fecha_culminacion column:'fecha_de_culminacion'
    }
}
