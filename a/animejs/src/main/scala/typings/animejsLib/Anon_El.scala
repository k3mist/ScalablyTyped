package typings
package animejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_El extends js.Object {
  var el: stdLib.HTMLElement | stdLib.SVGElement
  var property: java.lang.String
  var totalLength: scala.Double
}

object Anon_El {
  @scala.inline
  def apply(el: stdLib.HTMLElement | stdLib.SVGElement, property: java.lang.String, totalLength: scala.Double): Anon_El = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], property = property, totalLength = totalLength)
  
    __obj.asInstanceOf[Anon_El]
  }
}

