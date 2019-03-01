package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcParameterMetaData extends js.Object {
  def getParameterClassName(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getParameterCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParameterMode(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParameterType(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParameterTypeName(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getPrecision(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getScale(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isNullable(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isSigned(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
}

object JdbcParameterMetaData {
  @scala.inline
  def apply(
    getParameterClassName: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getParameterCount: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getParameterMode: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    getParameterType: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    getParameterTypeName: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getPrecision: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    getScale: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    isNullable: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    isSigned: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean]
  ): JdbcParameterMetaData = {
    val __obj = js.Dynamic.literal(getParameterClassName = getParameterClassName, getParameterCount = getParameterCount, getParameterMode = getParameterMode, getParameterType = getParameterType, getParameterTypeName = getParameterTypeName, getPrecision = getPrecision, getScale = getScale, isNullable = isNullable, isSigned = isSigned)
  
    __obj.asInstanceOf[JdbcParameterMetaData]
  }
}

