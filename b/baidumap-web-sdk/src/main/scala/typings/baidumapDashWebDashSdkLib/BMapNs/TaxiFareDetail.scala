package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxiFareDetail extends js.Object {
  var initialFare: scala.Double
  var totalFare: scala.Double
  var unitFare: scala.Double
}

object TaxiFareDetail {
  @scala.inline
  def apply(initialFare: scala.Double, totalFare: scala.Double, unitFare: scala.Double): TaxiFareDetail = {
    val __obj = js.Dynamic.literal(initialFare = initialFare, totalFare = totalFare, unitFare = unitFare)
  
    __obj.asInstanceOf[TaxiFareDetail]
  }
}

