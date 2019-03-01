package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a formal parameter of a method. */
trait ParamInfo extends js.Object {
  /** parameter mode: in, out, inout */
  var aMode: ParamMode
  /** name of the parameter */
  var aName: java.lang.String
  /** formal type of the parameter */
  var aType: XIdlClass[_]
}

object ParamInfo {
  @scala.inline
  def apply(aMode: ParamMode, aName: java.lang.String, aType: XIdlClass[_]): ParamInfo = {
    val __obj = js.Dynamic.literal(aMode = aMode, aName = aName, aType = aType)
  
    __obj.asInstanceOf[ParamInfo]
  }
}

