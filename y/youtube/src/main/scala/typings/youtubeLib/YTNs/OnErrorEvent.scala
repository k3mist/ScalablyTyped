package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorEvent extends PlayerEvent {
  /**
  		 * Which type of error occurred.
  		 */
  var data: PlayerError
}

object OnErrorEvent {
  @scala.inline
  def apply(data: PlayerError, target: Player): OnErrorEvent = {
    val __obj = js.Dynamic.literal(data = data, target = target)
  
    __obj.asInstanceOf[OnErrorEvent]
  }
}

