package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceGathererEvent extends Event {
  val candidate: RTCIceCandidateDictionary | RTCIceCandidateComplete = js.native
}

@JSGlobal("RTCIceGathererEvent")
@js.native
object RTCIceGathererEvent
  extends ScalablyTyped.runtime.Instantiable0[RTCIceGathererEvent]
