package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyserNode extends AudioNode {
  var fftSize: scala.Double = js.native
  val frequencyBinCount: scala.Double = js.native
  var maxDecibels: scala.Double = js.native
  var minDecibels: scala.Double = js.native
  var smoothingTimeConstant: scala.Double = js.native
  def getByteFrequencyData(array: Uint8Array): scala.Unit = js.native
  def getByteTimeDomainData(array: Uint8Array): scala.Unit = js.native
  def getFloatFrequencyData(array: Float32Array): scala.Unit = js.native
  def getFloatTimeDomainData(array: Float32Array): scala.Unit = js.native
}

@JSGlobal("AnalyserNode")
@js.native
object AnalyserNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, AnalyserNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ AnalyserOptions, AnalyserNode]

