package admin

class IES{

    int id;
    String nombre;
    String sector;
    admin.Caracter_IES caracter;


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
    static hasOne = [caracter:admin.Caracter_IES]
    static hasMany = [campus:admin.Campus]
}
