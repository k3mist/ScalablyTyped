package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdultScore extends js.Object {
  var adultScore: scala.Double
  var isAdultContent: scala.Boolean
  var isRacyContent: scala.Boolean
  var racyScore: scala.Double
}

object Anon_AdultScore {
  @scala.inline
  def apply(
    adultScore: scala.Double,
    isAdultContent: scala.Boolean,
    isRacyContent: scala.Boolean,
    racyScore: scala.Double
  ): Anon_AdultScore = {
    val __obj = js.Dynamic.literal(adultScore = adultScore, isAdultContent = isAdultContent, isRacyContent = isRacyContent, racyScore = racyScore)
  
    __obj.asInstanceOf[Anon_AdultScore]
  }
}

