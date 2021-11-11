package net.snezhniy

import tornadofx.*

class MyView : View() {
    override val root = vbox {
        button("Press me")
        label("Waiting")
    }
}

class MyApp : App(MyView::class)

fun main(args: Array<String>) {
    launch<MyApp>(args)
}
