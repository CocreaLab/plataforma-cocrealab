package org.cocrealab

import org.apache.tools.ant.types.resources.comparators.Date
import org.apache.xpath.operations.String

class Miembro {

    Integer id
    String nombre
    String segundoNombre
    String apellido
    String segundoApellido
    String genero
    String tipoIdentificacion
    Integer identificacion
    String telefonoFijo
    String celular
    String direccion
    Date fechaNacimiento
    String email
    String emailRespaldo

    static constraints={
        id(blank: false,min:1)
        nombre(blank: false)
        segundoNombre(blank: false)
        apellido(blank: false)
        segundoApellido(blank: false)
        genero(blank: false,inList:['M', 'F'])
        tipoIdentificacion(blank: false,inList: ['CC','TI','CE'])
        telefonoFijo(blank: false)
        celular(blank: false)
        direccion(blank: false)
        fechaNacimiento(blank: false)
        email(blank: false,email:true)
        emailRespaldo(email: true)

    }
    static mapping={
        identificacion column: 'Identificacion'
        email column: 'Email'
    }

    static belongsTo = [municipio:Municipio, pais:Pais]
    static hasMany = [estudios:Estudios_Miembros
                      ,Identificaciones:Historial_Identificaciones
                      ,Intereses:Intereses_Usuarios
                      ,Solicitudes:Solicitud]

}
