package org.cocrealab

class Historial_Identificaciones {

    Integer id
    Integer numero
    Date fechaDeActualizacion
    String tipo_identificacion

    static BelongsTo = Miembro
    static constraints = {
        id(blank: false)
        numero(blank: false,min:100000)
        fechaDeActualizacion(blank: false)
        tipo_identificacion(blank: false,inList:['CC','CE','TI'])
    }

}
