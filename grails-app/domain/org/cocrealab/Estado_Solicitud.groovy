package org.cocrealab

class Estado_Solicitud {
    Integer id
    String nombre

    static constraints = {
        id(blank:false)
        nombre(blank: false)
    }
}
