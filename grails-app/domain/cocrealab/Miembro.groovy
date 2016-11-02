package admin

class Miembro {

    int id
    String nombre
    String segundo_nombre
    String apellido
    String segundo_apellido
    String genero
    String tipo_identificacion
    int identificacion
    String telefono_fijo
    String celular
    String direccion
    Date fecha_nacimiento
    String email
    String email_respaldo

    static constraints={
        id(blank: false,min:1)
        nombre(blank: false)
        segundo_nombre(blank: false)
        apellido(blank: false)
        segundo_apellido(blank: false)
        genero(blank: false,inList:['M', 'F'])
        tipo_identificacion(blank: false,inList: ['CC','TI','CE'])
        telefono_fijo(blank: false)
        celular(blank: false)
        direccion(blank: false)
        fecha_nacimiento(blank: false)
        email(blank: false,email:true)
        email_respaldo(email: true)

    }
    static mapping={
        id column : 'id'
        nombre column: 'nombre'
        segundo_nombre column: 'segundo_nombre'
        apellido column: 'apellido'
        segundo_apellido column: 'segundo_apellido'
        genero column: 'genero'
        tipo_identificacion column: 'Tipo_Identificacion'
        identificacion column: 'Identificacion'
        telefono_fijo column: 'telefono_fijo'
        celular column: 'celular'
        direccion column: 'direccion'
        fecha_nacimiento column: 'fecha_nacimiento'
        email column: 'Email'
        email_respaldo column: 'Email_respaldo'
    }

    static belongsTo = [municipio:admin.Municipio,pais:admin.Pais]
    static hasMany = [estudios:admin.Estudios_Miembros
                      ,Identificaciones:admin.Historial_Identificaciones
                      ,Intereses:admin.Intereses_Usuarios
                      ,Solicitudes:admin.Solicitud_Miembro]

}
