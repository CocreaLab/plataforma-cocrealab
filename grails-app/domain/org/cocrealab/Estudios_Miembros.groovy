package org.cocrealab

import org.apache.tools.ant.types.resources.comparators.Date

class Estudios_Miembros {

    Integer id
    Integer periodos_cursados
    Date fechaCulminacion
    static hasOne = [programa_estudio:Programa_Campus, estado:Estados_Estudios]
    static BelongsTo = Miembro
    static constraints = {
        fecha_culminacion(blank: false)
        id(blank: false)
        periodos_cursados(blank: false,min:1,max:10)
    }
    static mapping={
        fechaCulminacion column:'fecha_de_culminacion'
    }
}
