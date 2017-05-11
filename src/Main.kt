import kotlin.browser.document

fun main(args: Array<String>) {
    println("Hello")

    val x = 10

    val html =
"""
<h1>Hello</h1>
<p>$x</p>
<button id="b1">Click Me</button>
"""

    val root = document.getElementById("root")
    root!!.innerHTML = html
    val b1 = document.getElementById("b1")
    b1!!.addEventListener("click",{ println("clicked") })

}