package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdStringOptional extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IdStringOptional {
  @scala.inline
  def apply(id: java.lang.String = null): Anon_IdStringOptional = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_IdStringOptional]
  }
}

