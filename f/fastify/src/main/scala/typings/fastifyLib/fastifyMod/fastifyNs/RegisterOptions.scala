package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Register options
  */
trait RegisterOptions[HttpServer, HttpRequest, HttpResponse]
  extends RouteShorthandOptions[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

