package admin

class Departamento {

    int id
    String nombre


    static constraints = {
         id(blank: false,min: 1)
         nombre(blank: false)
    }

    static mapping = {
        id column:'id'
        nombre column:'nombre'
    }

    static hasMany = [municipios:admin.Municipio]
}
