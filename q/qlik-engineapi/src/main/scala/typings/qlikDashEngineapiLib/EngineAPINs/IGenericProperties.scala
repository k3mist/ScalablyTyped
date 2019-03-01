package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericProperties
  */
trait IGenericProperties
  extends // ?Dynamic properties?
/* qMetaDef */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Identifier and type of the object.
    * >> This parameter is mandatory.
    */
  var qInfo: INxInfo
}

object IGenericProperties {
  @scala.inline
  def apply(
    qInfo: INxInfo,
    StringDictionary: // ?Dynamic properties?
  /* qMetaDef */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IGenericProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IGenericProperties]
  }
}

