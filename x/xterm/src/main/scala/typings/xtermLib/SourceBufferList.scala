package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBufferList
  extends EventTarget
     with /* index */ ScalablyTyped.runtime.NumberDictionary[SourceBuffer] {
  val length: scala.Double = js.native
  def item(index: scala.Double): SourceBuffer = js.native
}

@JSGlobal("SourceBufferList")
@js.native
object SourceBufferList
  extends ScalablyTyped.runtime.Instantiable0[SourceBufferList]
