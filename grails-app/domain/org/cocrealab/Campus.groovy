package org.cocrealab

class Campus {
    Integer id
    static belongsTo=[ies: IES, municipio:Municipio]
    static hasMany = [programas:Programa_Campus]
}
