package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RankedStatsDto extends js.Object {
  var champions: js.Array[ChampionStatsDto]
  var modifyDate: scala.Double
  var summonerId: scala.Double
}

object RankedStatsDto {
  @scala.inline
  def apply(champions: js.Array[ChampionStatsDto], modifyDate: scala.Double, summonerId: scala.Double): RankedStatsDto = {
    val __obj = js.Dynamic.literal(champions = champions, modifyDate = modifyDate, summonerId = summonerId)
  
    __obj.asInstanceOf[RankedStatsDto]
  }
}

