package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TrackEntry")
@js.native
class TrackEntry () extends js.Object {
  var alpha: scala.Double = js.native
  var animation: Animation = js.native
  var animationEnd: scala.Double = js.native
  var animationLast: scala.Double = js.native
  var animationStart: scala.Double = js.native
  var attachmentThreshold: scala.Double = js.native
  var delay: scala.Double = js.native
  var drawOrderThreshold: scala.Double = js.native
  var eventThreshold: scala.Double = js.native
  var interruptAlpha: scala.Double = js.native
  var listener: AnimationStateListener2 = js.native
  var loop: scala.Boolean = js.native
  var mixDuration: scala.Double = js.native
  var mixTime: scala.Double = js.native
  var mixingFrom: TrackEntry = js.native
  var next: TrackEntry = js.native
  var nextAnimationLast: scala.Double = js.native
  var nextTrackLast: scala.Double = js.native
  var timeScale: scala.Double = js.native
  var timelineData: js.Array[scala.Double] = js.native
  var timelineDipMix: js.Array[TrackEntry] = js.native
  var timelinesRotation: js.Array[scala.Double] = js.native
  var totalAlpha: scala.Double = js.native
  var trackEnd: scala.Double = js.native
  var trackIndex: scala.Double = js.native
  var trackLast: scala.Double = js.native
  var trackTime: scala.Double = js.native
  def getAnimationTime(): scala.Double = js.native
  def hasTimeline(id: scala.Double): scala.Boolean = js.native
  def isComplete(): scala.Boolean = js.native
  def reset(): scala.Unit = js.native
  def resetRotationDirections(): scala.Unit = js.native
  def setAnimationLast(animationLast: scala.Double): scala.Unit = js.native
  def setTimelineData(to: TrackEntry, mixingToArray: js.Array[TrackEntry], propertyIDs: IntSet): TrackEntry = js.native
}

