package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionProperties width extend GenericProperties
  */
trait IGenericDimensionProperties extends IGenericProperties {
  var qDim: INxLibraryDimensionDef
}

object IGenericDimensionProperties {
  @scala.inline
  def apply(qDim: INxLibraryDimensionDef, qInfo: INxInfo): IGenericDimensionProperties = {
    val __obj = js.Dynamic.literal(qDim = qDim, qInfo = qInfo)
  
    __obj.asInstanceOf[IGenericDimensionProperties]
  }
}

