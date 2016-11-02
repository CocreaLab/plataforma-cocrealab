package org.cocrealab

import org.apache.xpath.operations.String

class Caracter_IES {

    Integer id
    String nombre

    static constraints = {
        id(blank: false)
        nombre(blank:false)

    }
    static belongsTo= IES
}
