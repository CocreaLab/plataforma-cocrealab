package admin

class Historial_Identificaciones {

    int id
    int numero
    Date fecha_de_actualizacion
    String tipo_identificacion

    static BelongsTo = admin.Miembro
    static constraints = {
        id(blank: false)
        numero(blank: false,min:100000)
        fecha_de_actualizacion(blank: false)
        tipo_identificacion(blank: false,inList:['CC','CE','TI'])
    }

}
