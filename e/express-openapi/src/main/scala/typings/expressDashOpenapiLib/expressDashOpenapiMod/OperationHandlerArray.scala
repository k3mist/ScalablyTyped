package typings
package expressDashOpenapiLib.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHandlerArray
  extends Operation
     with /* index */ org.scalablytyped.runtime.NumberDictionary[expressLib.expressMod.eNs.RequestHandler] {
  var apiDoc: js.UndefOr[expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs.OperationObject] = js.undefined
}

object OperationHandlerArray {
  @scala.inline
  def apply(
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[expressLib.expressMod.eNs.RequestHandler] = null,
    apiDoc: expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs.OperationObject = null
  ): OperationHandlerArray = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (apiDoc != null) __obj.updateDynamic("apiDoc")(apiDoc)
    __obj.asInstanceOf[OperationHandlerArray]
  }
}

