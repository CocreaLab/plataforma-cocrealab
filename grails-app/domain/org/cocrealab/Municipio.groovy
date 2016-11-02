package org.cocrealab

class Municipio {

    Integer id;
    Integer codigoDivipola;
    String nombre
    float longitud
    float latitud

    static constraints = {
        id(blank: false,min: 1)
        nombre(blank: false)
        codigoDivipola(blank: false,min:1000)
        longitud(blank: false)
        latitud(blank: false)
    }

    static mapping = {
        id column:'id'
        nombre column:'nombre'
        longitud column:'longitud'
        latitud column:'latitud'
    }
    static hasMany =  [campus:Campus, miembros:Miembro]
    static belongsTo = [departamemto:Departamento]
}
