package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement extends Node {
  var closeStrip: StripFlags
  var hash: Hash
  var inverse: Program
  var inverseStrip: StripFlags
  var openStrip: StripFlags
  var params: js.Array[Expression]
  var path: PathExpression
  var program: Program
}

object BlockStatement {
  @scala.inline
  def apply(
    closeStrip: StripFlags,
    hash: Hash,
    inverse: Program,
    inverseStrip: StripFlags,
    loc: SourceLocation,
    openStrip: StripFlags,
    params: js.Array[Expression],
    path: PathExpression,
    program: Program,
    `type`: java.lang.String
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(closeStrip = closeStrip, hash = hash, inverse = inverse, inverseStrip = inverseStrip, loc = loc, openStrip = openStrip, params = params, path = path, program = program, `type` = `type`)
  
    __obj.asInstanceOf[BlockStatement]
  }
}

