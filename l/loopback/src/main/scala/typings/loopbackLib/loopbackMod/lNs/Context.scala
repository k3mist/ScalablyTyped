package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context
  * @interface
  * @property {Principal[]} principals An Array of principals
  * @property {() => void} model The model class
  * @property {string} modelName The model name
  * @property {string} modelId The model id
  * @property {string} property The model property/method/relation name
  * @property {string} method The model method to be invoked
  * @property {string} accessType The access type
  * @property {AccessToken} accessToken The access toke
  * @returns {AccessContext}
  */
trait Context extends js.Object {
  /** The access type */
  var accesType: java.lang.String
  /** The access token */
  var accessToken: AccessToken
  /** The model method to be invoked */
  var method: java.lang.String
  /** The model id */
  var modelId: java.lang.String
  /** The model name */
  var modelName: java.lang.String
  /** An Array of principals */
  var principals: js.Array[Principal]
  /** The model property/method/relation name */
  var property: java.lang.String
  /** The model class */
  def model(): scala.Unit
}

object Context {
  @scala.inline
  def apply(
    accesType: java.lang.String,
    accessToken: AccessToken,
    method: java.lang.String,
    model: js.Function0[scala.Unit],
    modelId: java.lang.String,
    modelName: java.lang.String,
    principals: js.Array[Principal],
    property: java.lang.String
  ): Context = {
    val __obj = js.Dynamic.literal(accesType = accesType, accessToken = accessToken, method = method, model = model, modelId = modelId, modelName = modelName, principals = principals, property = property)
  
    __obj.asInstanceOf[Context]
  }
}

