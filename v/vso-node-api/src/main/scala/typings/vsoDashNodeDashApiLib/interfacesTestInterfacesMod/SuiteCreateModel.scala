package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteCreateModel extends js.Object {
  var name: java.lang.String
  var queryString: java.lang.String
  var requirementIds: js.Array[scala.Double]
  var suiteType: java.lang.String
}

object SuiteCreateModel {
  @scala.inline
  def apply(
    name: java.lang.String,
    queryString: java.lang.String,
    requirementIds: js.Array[scala.Double],
    suiteType: java.lang.String
  ): SuiteCreateModel = {
    val __obj = js.Dynamic.literal(name = name, queryString = queryString, requirementIds = requirementIds, suiteType = suiteType)
  
    __obj.asInstanceOf[SuiteCreateModel]
  }
}

