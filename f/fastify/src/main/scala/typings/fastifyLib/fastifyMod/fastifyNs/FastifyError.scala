package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fastify custom error
  */
trait FastifyError
  extends nodeLib.Error {
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Validation errors
    */
  var validation: js.UndefOr[js.Array[ValidationResult]] = js.undefined
}

