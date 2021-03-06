package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisEvent extends Event {
  val charIndex: scala.Double = js.native
  val elapsedTime: scala.Double = js.native
  val name: java.lang.String = js.native
  val utterance: SpeechSynthesisUtterance = js.native
}

@JSGlobal("SpeechSynthesisEvent")
@js.native
object SpeechSynthesisEvent
  extends org.scalablytyped.runtime.Instantiable0[SpeechSynthesisEvent]

