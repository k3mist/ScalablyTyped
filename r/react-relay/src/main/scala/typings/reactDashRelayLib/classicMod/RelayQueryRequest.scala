package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayQueryRequest extends js.Object {
  def getDebugName(): java.lang.String
  def getID(): java.lang.String
  def getQueryString(): java.lang.String
  def getVariables(): RelayVariables
  def reject(errors: js.Any): js.Any
  def resolve(result: RelayQueryRequestResolve): js.Any
}

object RelayQueryRequest {
  @scala.inline
  def apply(
    getDebugName: () => java.lang.String,
    getID: () => java.lang.String,
    getQueryString: () => java.lang.String,
    getVariables: () => RelayVariables,
    reject: js.Any => js.Any,
    resolve: RelayQueryRequestResolve => js.Any
  ): RelayQueryRequest = {
    val __obj = js.Dynamic.literal(getDebugName = js.Any.fromFunction0(getDebugName), getID = js.Any.fromFunction0(getID), getQueryString = js.Any.fromFunction0(getQueryString), getVariables = js.Any.fromFunction0(getVariables), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[RelayQueryRequest]
  }
}

