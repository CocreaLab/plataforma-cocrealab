package admin

class Caracter_IES {

    int id
    String nombre

    static constraints = {
        id(blank: false)
        nombre(blank:false)

    }
    static belongsTo= admin.IES
}
