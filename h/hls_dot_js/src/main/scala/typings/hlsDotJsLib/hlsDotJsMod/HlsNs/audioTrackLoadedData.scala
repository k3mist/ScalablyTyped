package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait audioTrackLoadedData extends js.Object {
  var details: LevelDetails
  var id: java.lang.String
  var stats: Stats
}

object audioTrackLoadedData {
  @scala.inline
  def apply(details: LevelDetails, id: java.lang.String, stats: Stats): audioTrackLoadedData = {
    val __obj = js.Dynamic.literal(details = details, id = id, stats = stats)
  
    __obj.asInstanceOf[audioTrackLoadedData]
  }
}

