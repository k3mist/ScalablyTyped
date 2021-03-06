package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  def visit[Result](visitor: Visitor[Result]): Result
}

object Node {
  @scala.inline
  def apply(
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    visit: Visitor[js.Any] => js.Any
  ): Node = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan, visit = js.Any.fromFunction1(visit))
  
    __obj.asInstanceOf[Node]
  }
}

