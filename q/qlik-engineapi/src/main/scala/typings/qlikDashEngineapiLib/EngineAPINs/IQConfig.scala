package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQConfig extends js.Object {
  var qFeatures: qlikDashEngineapiLib.Anon_QIsDesktop
  var qServices: js.Array[qlikDashEngineapiLib.Anon_QNameQUrl]
  var qSystemProperties: qlikDashEngineapiLib.Anon_QPathSeparator
}

object IQConfig {
  @scala.inline
  def apply(
    qFeatures: qlikDashEngineapiLib.Anon_QIsDesktop,
    qServices: js.Array[qlikDashEngineapiLib.Anon_QNameQUrl],
    qSystemProperties: qlikDashEngineapiLib.Anon_QPathSeparator
  ): IQConfig = {
    val __obj = js.Dynamic.literal(qFeatures = qFeatures, qServices = qServices, qSystemProperties = qSystemProperties)
  
    __obj.asInstanceOf[IQConfig]
  }
}

