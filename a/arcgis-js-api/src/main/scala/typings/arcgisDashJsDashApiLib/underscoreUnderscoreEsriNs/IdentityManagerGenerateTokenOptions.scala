package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerGenerateTokenOptions
  extends stdLib.Object {
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var serverUrl: java.lang.String
  /**
    * Indicates if the server requires SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var ssl: scala.Boolean
  /**
    * The server token.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  var token: java.lang.String
}

object IdentityManagerGenerateTokenOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    serverUrl: java.lang.String,
    ssl: scala.Boolean,
    token: java.lang.String
  ): IdentityManagerGenerateTokenOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, serverUrl = serverUrl, ssl = ssl, token = token)
  
    __obj.asInstanceOf[IdentityManagerGenerateTokenOptions]
  }
}

