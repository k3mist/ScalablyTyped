package typings
package videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcue}
		 */
trait TextTrackCue extends js.Object {
  /**
  			 * The end time for this text track cue
  			 */
  var endTime: scala.Double
  /**
  			 * The unique id for this text track cue
  			 */
  var id: java.lang.String
  /**
  			 * Pause when the end time is reached if true.
  			 */
  var pauseOnExit: scala.Boolean
  /**
  			 * The start time for this text track cue
  			 */
  var startTime: scala.Double
  /**
  			 * The text this cue is holding
  			 */
  var text: java.lang.String
}

