package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interfaces for jQuery.fn.__plugin
trait IFnNewInstance extends js.Object {
  def createInstance(el: stdLib.HTMLElement, options: js.Any, pluginName: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement]
}

object IFnNewInstance {
  @scala.inline
  def apply(
    createInstance: (stdLib.HTMLElement, js.Any, java.lang.String) => jqueryLib.JQuery[stdLib.HTMLElement]
  ): IFnNewInstance = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction3(createInstance))
  
    __obj.asInstanceOf[IFnNewInstance]
  }
}

