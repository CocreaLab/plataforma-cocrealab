package org.cocrealab

class Tema {
    Integer id
    String nombre
    static belongsTo=Intereses_Usuarios

    static constraints = {
        id(blank:false)
        nombre(blank:false)
    }
}
