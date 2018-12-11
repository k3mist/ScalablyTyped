package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MimeTypeArray
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[Plugin] {
  val length: scala.Double
  def item(index: scala.Double): Plugin
  def namedItem(`type`: java.lang.String): Plugin
}

@JSGlobal("MimeTypeArray")
@js.native
object MimeTypeArray
  extends ScalablyTyped.runtime.Instantiable0[MimeTypeArray]
