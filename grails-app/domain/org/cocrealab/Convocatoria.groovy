package org.cocrealab

import org.apache.tools.ant.types.resources.comparators.Date


class Convocatoria {
    Integer id
    Date año
    Integer semestre

    static constraints = {
        id(blank: false)
        año(blank: false)
        semestre(blank: false)
    }
}
