package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartsProcessed extends js.Object {
  /**
    * The number of parts of the video that YouTube has already processed.
    */
  var partsProcessed: scala.Double
  /**
    * An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube processes the video.
    */
  var partsTotal: scala.Double
  /**
    * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video.
    */
  var timeLeftMs: scala.Double
}

object Anon_PartsProcessed {
  @scala.inline
  def apply(partsProcessed: scala.Double, partsTotal: scala.Double, timeLeftMs: scala.Double): Anon_PartsProcessed = {
    val __obj = js.Dynamic.literal(partsProcessed = partsProcessed, partsTotal = partsTotal, timeLeftMs = timeLeftMs)
  
    __obj.asInstanceOf[Anon_PartsProcessed]
  }
}

