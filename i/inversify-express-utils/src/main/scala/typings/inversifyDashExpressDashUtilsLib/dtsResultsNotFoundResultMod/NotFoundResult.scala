package typings
package inversifyDashExpressDashUtilsLib.dtsResultsNotFoundResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotFoundResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
}

object NotFoundResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ]
  ): NotFoundResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = executeAsync)
  
    __obj.asInstanceOf[NotFoundResult]
  }
}

