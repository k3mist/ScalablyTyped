package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwardsResponseObject extends ResponseObject {
  var name: java.lang.String
  var order: scala.Double
  var qualifies: js.Array[java.lang.String]
  var sku: java.lang.String
  var team: java.lang.String
}

object AwardsResponseObject {
  @scala.inline
  def apply(
    name: java.lang.String,
    order: scala.Double,
    qualifies: js.Array[java.lang.String],
    sku: java.lang.String,
    team: java.lang.String
  ): AwardsResponseObject = {
    val __obj = js.Dynamic.literal(name = name, order = order, qualifies = qualifies, sku = sku, team = team)
  
    __obj.asInstanceOf[AwardsResponseObject]
  }
}

