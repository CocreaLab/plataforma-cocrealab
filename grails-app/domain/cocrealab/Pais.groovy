package admin

class Pais {

    int id
    String nombre
    static constraints = {
        id(blank: false,min:1)
        nombre(blank: false)
    }
}
