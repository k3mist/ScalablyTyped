package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * fastify's wrapped version of node.js IncomingMessage
  */
trait FastifyRequest[HttpRequest, Query, Params, Headers, Body] extends js.Object {
  var body: Body
  var headers: Headers
  var hostname: java.lang.String
  var id: js.Any
  var ip: java.lang.String
  var log: Logger
  var params: Params
  var query: Query
  var raw: HttpRequest
  var req: HttpRequest
}

