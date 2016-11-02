package admin

class Municipio {

    int id;
    int codigo_divipola;
    String nombre
    float longitud
    float latitud

    static constraints = {
        id(blank: false,min: 1)
        nombre(blank: false)
        codigo_divipola(blank: false,min:1000)
        longitud(blank: false)
        latitud(blank: false)
    }

    static mapping = {
        id column:'id'
        nombre column:'nombre'
        codigo_divipola column:'codigo_divipola'
        longitud column:'longitud'
        latitud column:'latitud'
    }
    static hasMany =  [campus:admin.Campus,miembros:admin.Miembro]
    static belongsTo = [departamemto:admin.Departamento]
}
