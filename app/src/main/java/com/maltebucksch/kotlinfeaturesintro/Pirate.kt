package com.maltebucksch.kotlinfeaturesintro


/**
 * Created by Malte Bucksch on 26/10/2017.
 */
class Pirate(name: String) {
    var name = name
        set(newName) {
            field = newName + "fffknfn"
        }

    init {

    }

}