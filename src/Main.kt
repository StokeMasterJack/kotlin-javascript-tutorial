import kotlin.browser.document

fun main(args: Array<String>) {

    val root = document.getElementById("root")

    val div = document.createElement("div")
    val h1 = document.createElement("h1")
    val b1 = document.createElement("button")

    h1.textContent = "Hello 2"
    b1.textContent = "Click Me 2"
    b1.addEventListener("click",{ println("clicked 2")})

    div.appendChild(h1)
    div.appendChild(b1)

    root!!.appendChild(div)

}