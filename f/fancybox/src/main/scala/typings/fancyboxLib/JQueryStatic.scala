package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var fancybox: FancyBoxJQueryMethods
}

object JQueryStatic {
  @scala.inline
  def apply(fancybox: FancyBoxJQueryMethods): JQueryStatic = {
    val __obj = js.Dynamic.literal(fancybox = fancybox)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

