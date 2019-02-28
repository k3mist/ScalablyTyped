package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional configuration parameters for the route being created
  */
trait RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body] extends js.Object {
  var attachValidation: js.UndefOr[scala.Boolean] = js.undefined
  var bodyLimit: js.UndefOr[scala.Double] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var preHandler: js.UndefOr[
    (FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ])
  ] = js.undefined
  var preSerialization: js.UndefOr[
    (FastifyMiddlewareWithPayload[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddlewareWithPayload[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ])
  ] = js.undefined
  var preValidation: js.UndefOr[
    (FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]) | (js.Array[
      FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]
    ])
  ] = js.undefined
  var schema: js.UndefOr[RouteSchema] = js.undefined
  var schemaCompiler: js.UndefOr[SchemaCompiler] = js.undefined
}

