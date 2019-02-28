package typings
package atPulumiAwsLib.apigatewayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseArgs extends js.Object {
  /**
    * A map specifying the templates used to transform the response body.
    */
  val responseParameters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
    */
  val responseTemplates: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * The response type of the associated GatewayResponse.
    */
  val responseType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The string identifier of the associated REST API.
    */
  val restApiId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The HTTP status code of the Gateway Response.
    */
  val statusCode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

