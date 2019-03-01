package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is the layout for GenericVariableProperties.
  */
trait IGenericVariableLayout extends IGenericBaseLayout {
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: scala.Boolean
  /**
    * A value.
    */
  var qNum: scala.Double
  /**
    * Some text.
    */
  var qText: java.lang.String
}

object IGenericVariableLayout {
  @scala.inline
  def apply(
    qInfo: INxInfo,
    qIsScriptCreated: scala.Boolean,
    qMeta: INxMeta,
    qNum: scala.Double,
    qText: java.lang.String
  ): IGenericVariableLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo, qIsScriptCreated = qIsScriptCreated, qMeta = qMeta, qNum = qNum, qText = qText)
  
    __obj.asInstanceOf[IGenericVariableLayout]
  }
}

