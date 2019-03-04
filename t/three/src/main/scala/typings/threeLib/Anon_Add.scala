package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  var enabled: scala.Boolean
  var files: js.Any
  def add(key: java.lang.String, file: js.Any): scala.Unit
  def clear(): scala.Unit
  def get(key: java.lang.String): js.Any
  def remove(key: java.lang.String): scala.Unit
}

object Anon_Add {
  @scala.inline
  def apply(
    add: (java.lang.String, js.Any) => scala.Unit,
    clear: () => scala.Unit,
    enabled: scala.Boolean,
    files: js.Any,
    get: java.lang.String => js.Any,
    remove: java.lang.String => scala.Unit
  ): Anon_Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), enabled = enabled, files = files, get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[Anon_Add]
  }
}

