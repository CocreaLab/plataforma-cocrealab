package org.cocrealab

class IES{

    Integer id;
    String nombre;
    String sector;
    Caracter_IES caracter;


    static constraints = {
        id(blank : false)
        nombre(blank :false)
        sector(blank: false,inList:['O', 'P'])
    }

    static mapping = {
        id column : 'id'
        nombre column: 'nombre'
        sector column: 'sector'
    }
    static hasOne = [caracter:Caracter_IES]
    static hasMany = [campus:Campus]
}
