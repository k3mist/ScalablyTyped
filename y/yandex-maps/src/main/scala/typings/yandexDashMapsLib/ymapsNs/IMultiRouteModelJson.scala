package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiRouteModelJson extends js.Object {
  var params: IMultiRouteParams
  var referencePoints: js.Array[IMultiRouteReferencePoint]
}

object IMultiRouteModelJson {
  @scala.inline
  def apply(params: IMultiRouteParams, referencePoints: js.Array[IMultiRouteReferencePoint]): IMultiRouteModelJson = {
    val __obj = js.Dynamic.literal(params = params, referencePoints = referencePoints)
  
    __obj.asInstanceOf[IMultiRouteModelJson]
  }
}

