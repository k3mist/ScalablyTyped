package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoldDto extends js.Object {
  var base: scala.Double
  var purchasable: scala.Boolean
  var sell: scala.Double
  var total: scala.Double
}

object GoldDto {
  @scala.inline
  def apply(base: scala.Double, purchasable: scala.Boolean, sell: scala.Double, total: scala.Double): GoldDto = {
    val __obj = js.Dynamic.literal(base = base, purchasable = purchasable, sell = sell, total = total)
  
    __obj.asInstanceOf[GoldDto]
  }
}

