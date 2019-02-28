package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A List of TextTrackCues.
	 *
	 * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcuelist}
	 */
trait TextTrackCueList
  extends /**
		 * Index getters for the cues.
		 *
		 * @param index
		 */
/* index */ org.scalablytyped.runtime.NumberDictionary[videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueListNs.TextTrackCue] {
  /**
  		 * The current number of `TextTrackCue`s in the TextTrackCueList.
  		 */
  var length: scala.Double
  /**
  		 * Get a `TextTrackCue` that is currently in the `TextTrackCueList` by id.
  		 *
  		 * @param id
  		 *        The id of the cue that should be searched for.
  		 *
  		 * @return A single cue or null if none was found.
  		 */
  def getCueById(id: java.lang.String): videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueListNs.TextTrackCue
}

