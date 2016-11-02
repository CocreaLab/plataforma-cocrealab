package org.cocrealab

class Nivel_Programa {

    Integer id
    String nombre

    static constraints = {
        id(blank: false,min:1)
        nombre(blank: false)
    }
    static belongsTo =  Programa
}
