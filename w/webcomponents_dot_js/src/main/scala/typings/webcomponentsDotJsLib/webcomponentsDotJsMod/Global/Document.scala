package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def registerElement(name: java.lang.String, prototype: webcomponentsDotJsLib.webcomponentsDotJsMod.CustomElementInit): webcomponentsDotJsLib.webcomponentsDotJsMod.CustomElementConstructor
}

object Document {
  @scala.inline
  def apply(
    registerElement: (java.lang.String, webcomponentsDotJsLib.webcomponentsDotJsMod.CustomElementInit) => webcomponentsDotJsLib.webcomponentsDotJsMod.CustomElementConstructor
  ): Document = {
    val __obj = js.Dynamic.literal(registerElement = js.Any.fromFunction2(registerElement))
  
    __obj.asInstanceOf[Document]
  }
}

