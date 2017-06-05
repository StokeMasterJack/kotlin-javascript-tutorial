import kotlinx.html.button
import kotlinx.html.div
import kotlinx.html.dom.create
import kotlinx.html.h1
import kotlinx.html.js.onClickFunction
import kotlin.browser.document

fun main(args: Array<String>) {

    val root = document.getElementById("root")


    val xyz: dynamic = js("window.xyz")
    println("xyz: $xyz")


    val user: dynamic = js("window.user")
    println(user.firstName)

    val myFunction: dynamic = js("window.myFunction")
    myFunction()


    val div = document.create.div {
        h1 {
            +"Hello Kotlinx Html"
        }
        button {
            +"Click Me"
            onClickFunction = { println("Clicked Again") }
        }
    }

    root!!.appendChild(div)

}