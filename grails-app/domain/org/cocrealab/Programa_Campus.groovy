package org.cocrealab

class Programa_Campus {

    Integer id
    Integer codigoSNIES
    Integer resolucionAprobacion
    String tipoPeriodo
    Integer cantidadPeriodos
    Integer cantidadCreditos
    Integer costoMatricula

    static constraints={
        id(blank: false,min:1)
        resolucionAprobacion(blank:false)
        codigoSNIES(blank: false)
        tipoPeriodo(blank: false,inList:['S', 'ND', 'T', 'A', 'P', 'C', 'M'])
        cantidadPeriodos(blank: false)
        cantidadCreditos(blank: false)
        costoMatricula(blank: false)

    }
    static mapping={

        id column : 'id'
        resolucionAprobacion column: 'resolucion_de_aprobacion'
        codigoSNIES column: 'codigo_SNIES'
    }
    static hasOne = [programa:Programa]
    static belongsTo = [campus:Campus]
}
