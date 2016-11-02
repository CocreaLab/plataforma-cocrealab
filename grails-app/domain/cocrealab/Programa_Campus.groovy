package admin

class Programa_Campus {

    int id
    int codigo_SNIES
    int resolucion_aprobacion
    String tipo_periodo
    int cantidad_periodos
    int cantidad_creditos
    int costo_matricula

    static constraints={
        id(blank: false,min:1)
        resolucion_aprobacion(blank:false)
        codigo_SNIES(blank: false)
        tipo_periodo(blank: false,inList:['S', 'ND', 'T', 'A', 'P', 'C', 'M'])
        cantidad_periodos(blank: false)
        cantidad_creditos(blank: false)
        costo_matricula(blank: false)

    }
    static mapping={

        id column : 'id'
        resolucion_aprobacion column: 'resolucion_de_aprobacion'
        codigo_SNIES column: 'codigo_SNIES'
        tipo_periodo column: 'tipo_periodo'
        cantidad_periodos column: 'cantidad_periodos'
        cantidad_creditos column: 'cantidad_creditos'
        costo_matricula column: 'costo_matricula'
    }
    static hasOne = [programa:admin.Programa]
    static belongsTo = [campus:admin.Campus]
}
