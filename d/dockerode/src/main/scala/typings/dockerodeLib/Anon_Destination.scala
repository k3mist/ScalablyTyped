package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var Destination: java.lang.String
  var Mode: java.lang.String
  var Propagation: java.lang.String
  var RW: scala.Boolean
  var Source: java.lang.String
}

object Anon_Destination {
  @scala.inline
  def apply(
    Destination: java.lang.String,
    Mode: java.lang.String,
    Propagation: java.lang.String,
    RW: scala.Boolean,
    Source: java.lang.String
  ): Anon_Destination = {
    val __obj = js.Dynamic.literal(Destination = Destination, Mode = Mode, Propagation = Propagation, RW = RW, Source = Source)
  
    __obj.asInstanceOf[Anon_Destination]
  }
}

