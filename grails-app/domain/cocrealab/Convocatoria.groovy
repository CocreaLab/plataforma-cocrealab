package admin

class Convocatoria {
    int id
    Date año
    int semestre

    static constraints = {
        id(blank: false)
        año(blank: false)
        semestre(blank: false)
    }
}
